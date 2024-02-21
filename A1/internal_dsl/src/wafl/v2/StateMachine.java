package wafl.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Marc L. W. Bertelsen
 * @apiNote
 * Used for creating a statemachine using a simple syntax
 */
public class StateMachine {

    private final String name;
    private StateNode currentState;
    private final Map<String,StateNode> stateNodes;
    private final BufferedReader reader;
    private boolean doRun;


    // Used for construction
    private String nodeUnderConstruction;
    private String inputUnderConstruction;
    private Outcome.Builder outcomeBuilder;

    public StateMachine(final String name) {
        this.name = name;
        this.doRun = true;
        this.stateNodes = new HashMap<>();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public StateMachine when(String state) {
        this.stateNodes.putIfAbsent(state, new StateNode(state));
        this.nodeUnderConstruction = state;
        return this;
    }

    public StateMachine on(String input) {
        this.outcomeBuilder = Outcome.newBuilder();
        this.inputUnderConstruction = input;
        return this;
    }

    public StateMachine and(Condition condition) {
        this.outcomeBuilder.condition(condition);
        return this;
    }

    public StateMachine then(String state) {
        this.outcomeBuilder.nextState(state);
        this.stateNodes.get(this.nodeUnderConstruction)
                .appendInput(this.inputUnderConstruction, this.outcomeBuilder.build());
        return this;
    }

    public StateMachine then(Callback callback) {
        this.outcomeBuilder.callback(callback);
        this.stateNodes.get(this.nodeUnderConstruction)
                .appendInput(this.inputUnderConstruction, this.outcomeBuilder.build());
        return this;
    }

    public StateMachine end() {
        this.outcomeBuilder.terminate();
        this.stateNodes.get(this.nodeUnderConstruction)
                .appendInput(this.inputUnderConstruction, this.outcomeBuilder.build());
        return this;
    }

    public void start(String initialState) {

        this.currentState = this.stateNodes.get(initialState);
        System.out.printf("Starting [%s] Initial state: [%s]\n", this.name, initialState);

        new Thread(() -> {
            while (this.doRun) {
                try {
                    // check input
                    this.currentState.printAvailableInputs();

                    System.out.printf("[%s] Enter: ", this.currentState.getName());
                    String line = this.reader.readLine();

                    if (this.currentState.willTerminate(line)) {
                        this.doRun = false;
                        System.out.printf("Ending [%s]\n\n", this.name);
                    }

                    Optional<Callback> callback = this.currentState.getCallback(line);
                    callback.ifPresent(Callback::call);

                    Optional<String> nextState = this.currentState.getNextState(line);
                    nextState.ifPresent(this::setState);

                } catch (IOException e) {
                    System.out.println("oops ¯\\_(ツ)_/¯");
                    return;
                }
            }
        }).start();
    }

    private void setState(String newState) {
        System.out.printf("Changing state [%s] -> [%s]\n", this.currentState.getName(), newState);
        this.currentState = this.stateNodes.get(newState);
    }

    @Override
    public String toString() {
        return String.format("MODEL = %s {\n%s\n}", this.name, this.stateNodes.keySet()
                .stream()
                .map(state -> String.format("\tWHEN = %s [\n%s\n\t]", state, this.stateNodes.get(state)))
                .collect(Collectors.joining("\n")));
    }
}
