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
    private PrintMode printMode;
    private Input input;
    private Output output;
    private boolean doRun;
    private boolean doSpawnThread;


    // Used for construction
    private String nodeUnderConstruction;
    private String inputUnderConstruction;
    private Outcome.Builder outcomeBuilder;

    public StateMachine(final String name) {
        this.name = name;
        this.doRun = true;
        this.doSpawnThread = false;
        this.stateNodes = new HashMap<>();
        this.printMode = PrintMode.NORMAL;
        this.output = System.out::print;
        this.input = defaultInput();
    }
    private Input defaultInput() {
        return new Input() {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            @Override
            public String in() {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    public StateMachine i(Input input) {
        this.input = input;
        return this;
    }

    public StateMachine o(Output output) {
        this.output = output;
        return this;
    }

    public StateMachine spawnTread() {
        this.doSpawnThread = true;
        return this;
    }

    public StateMachine printMode(PrintMode printMode) {
        this.printMode = printMode;
        return this;
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

    public StateMachine start(String initialState) {

        if (this.printMode.order >= PrintMode.MAXIMAL.order) {
            System.out.println(this);
        }

        if (this.printMode.order >= PrintMode.NORMAL.order) {
            this.output.out(String.format("Starting [%s] ", this.name));
        }
        this.setState(initialState);

        if (this.doSpawnThread) {
            new Thread(this::runLoop).start();
        } else {
            runLoop();
        }

        return this;
    }

    private void runLoop() {
        while (this.doRun) {
            // check input

            if (this.printMode.order >= PrintMode.MINIMAL.order) {
                this.currentState.printAvailableInputs();
                this.output.out(String.format("[%s] Enter: ", this.currentState.getName()));
            }
            String line = this.input.in();

            if (this.currentState.willTerminate(line)) {
                this.doRun = false;
                if (this.printMode.order >= PrintMode.NORMAL.order) {
                    this.output.out(String.format("Ending [%s]\n\n", this.name));
                }
            }

            Optional<Callback> callback = this.currentState.getCallback(line);
            callback.ifPresent(Callback::call);

            Optional<String> nextState = this.currentState.getNextState(line);
            nextState.ifPresent(this::setState);

        }
    }

    private void setState(String newState) {
        if (this.printMode.order >= PrintMode.NORMAL.order) {
            if (this.currentState == null) {
                this.output.out(String.format("Initial state: [%s]\n", newState));
            } else {
                this.output.out(String.format("Changing state [%s] -> [%s]\n", this.currentState.getName(), newState));
            }
        }
        else if (this.printMode.order == PrintMode.TESTING.order) {
            this.output.out(newState);
        }
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
