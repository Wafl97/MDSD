package wafl.v1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marc L. W. Bertelsen
 * Fluent API
 * This was the first attempt, before it was properly designed
 */
public class StateMachine  {

    private StateNode.Builder nodeBuilder;
    private InputLogic.Builder logicBuilder;
    private StateNode currentState;
    private final BufferedReader reader;
    private final Map<String,StateNode> stateNodes = new HashMap<>();

    public StateMachine() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start(String initialState) {
        this.currentState = this.stateNodes.get(initialState);

        new Thread(() -> {
            // Check logic conditions
            while (true) {
                try {
                    Thread.sleep(500);
                    checkLogicConditions();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        while (true) {
            // Check inputs
            checkInputs();
        }
    }

    private void checkLogicConditions() {
        if (this.currentState.hasAllConditionsMet("condition")) {
            String nextState = this.currentState.getNextState("condition");
            if (nextState != null) {
                System.out.println();
                this.setState(nextState);
                System.out.printf("[%s] Enter: ", this.currentState.getName());
                return;
            }
            Callback callback = this.currentState.getCallback("condition");
            if (callback != null) {
                callback.call();
            }
        }
    }

    public void checkInputs() {
        try {
            System.out.printf("[%s] Enter: ", this.currentState.getName());
            String line = this.reader.readLine();

            if (this.currentState.hasAllConditionsMet(line)) {
                String nextState = this.currentState.getNextState(line);
                if (nextState != null) {
                    this.setState(nextState);
                    return;
                }
                Callback callback = this.currentState.getCallback(line);
                if (callback != null) {
                    callback.call();
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public StateMachine when(String state) {
        this.nodeBuilder = StateNode.newBuilder().state(state);
        return this;
    }

    public StateMachine on(String input) {
        if (this.nodeBuilder == null) {
            System.out.println("'on' must come after 'when'");
            return this;
        }
        this.logicBuilder = InputLogic.newBuilder().inputString(input);
        return this;
    }

    public interface Condition {
        boolean check();
    }

    public StateMachine and(Condition condition) {
        if (this.logicBuilder == null) {
            System.out.println("'and' must come after 'on'");
            return this;
        }
        this.logicBuilder.condition(condition);
        return this;
    }


    public StateMachine on(Condition condition) {
        if (this.nodeBuilder == null) {
            System.out.println("'on' must come after 'when'");
            return this;
        }
        this.logicBuilder = InputLogic.newBuilder().condition(condition);
        return this;
    }

    public StateMachine then(String state) {
        if (this.nodeBuilder == null) {
            System.out.println("'then' must come after 'on' or 'and'");
            return this;
        }

        InputLogic logic = this.logicBuilder.nextState(state).build();
        StateNode node = this.nodeBuilder.build();
        if (this.stateNodes.containsKey(this.nodeBuilder.getNodeName())) {
            this.stateNodes.get(this.nodeBuilder.getNodeName())
                    .addInputLogic(logic.getInputString(), logic);
        } else {
            node.addInputLogic(logic.getInputString(), logic);
            this.stateNodes.put(this.nodeBuilder.getNodeName(), node);
        }
        System.out.printf("When %s on %s then %s\n", node.getName(), logic.getInputString(), logic.getNextState());
        this.nodeBuilder = null;
        this.logicBuilder = null;
        return this;
    }

    public interface Callback {
        void call();
    }
    public StateMachine then(Callback callback) {
        if (this.nodeBuilder == null) {
            System.out.println("'then' must come after 'on' or 'and'");
            return this;
        }

        InputLogic logic = this.logicBuilder.callback(callback).build();
        StateNode node = this.nodeBuilder.build();
        if (this.stateNodes.containsKey(this.nodeBuilder.getNodeName())) {
            this.stateNodes.get(this.nodeBuilder.getNodeName())
                    .addInputLogic(logic.getInputString(), logic);
        } else {
            node.addInputLogic(logic.getInputString(), logic);
            this.stateNodes.put(this.nodeBuilder.getNodeName(), node);
        }
        System.out.printf("When %s on %s then callback\n", node.getName(), logic.getInputString());
        this.nodeBuilder = null;
        this.logicBuilder = null;
        return this;
    }

    private void setState(String state) {
        System.out.printf("Setting state: [%s] -> [%s]\n", this.currentState.getName(), state);
        this.currentState = this.stateNodes.get(state);
    }
}
