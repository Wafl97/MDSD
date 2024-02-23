package wafl.dsl;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Marc L. W. Bertelsen
 */
public class StateNode {

    private final String name;
    private final Map<String, Set<Outcome>> inputs;

    public StateNode(String name) {
        this.name = name;
        this.inputs = new HashMap<>();
    }

    public void appendInput(String input, Outcome outcome) {
        if (!this.inputs.containsKey(input)) {
            this.inputs.put(input, new HashSet<>(){{add(outcome);}});
            return;
        }
        this.inputs.get(input).add(outcome);

    }

    public String getName() {
        return this.name;
    }

    public Optional<String> getNextState(String input) {
        // Check all conditions are met
        if (!this.inputs.containsKey(input)) {
            //System.out.printf("%s not found\n", input);
            return Optional.empty();
        }
        //System.out.printf("%s found checking conditions ... ", input);
        for (Outcome outcome : this.inputs.get(input)) {
            Optional<Condition> condition = outcome.getCondition();
            if (condition.isEmpty()) {
                //System.out.print(" success\n");
                return outcome.getNextState();
            }
            if (condition.get().check()) {
                //System.out.print(" success\n");
                return outcome.getNextState();
            }
        }
        //System.out.print(" failure\n");
        return Optional.empty();
    }

    public Optional<Callback> getCallback(String input) {
        // Check all conditions are met
        if (!this.inputs.containsKey(input)) {
            //System.out.printf("%s not found\n", input);
            return Optional.empty();
        }
        //System.out.printf("%s found checking conditions ... ", input);
        for (Outcome outcome : this.inputs.get(input)) {
            Optional<Condition> condition = outcome.getCondition();
            if (condition.isEmpty()) {
                //System.out.print(" success\n");
                return outcome.getCallback();
            }
            if (condition.get().check()) {
                //System.out.print(" success\n");
                return outcome.getCallback();
            }
        }
        //System.out.print(" failure\n");
        return Optional.empty();
    }

    public boolean willTerminate(String input) {
        // Check all conditions are met
        if (!this.inputs.containsKey(input)) {
            //System.out.printf("%s not found\n", input);
            return false;
        }
        //System.out.printf("%s found checking conditions ... ", input);
        for (Outcome outcome : this.inputs.get(input)) {
            Optional<Condition> condition = outcome.getCondition();
            if (condition.isEmpty()) {
                //System.out.print(" success\n");
                return outcome.terminate();
            }
            if (condition.get().check()) {
                //System.out.print(" success\n");
                return outcome.terminate();
            }
        }
        //System.out.print(" failure\n");
        return false;
    }

    @Override
    public String toString() {
        return this.inputs.keySet()
                .stream()
                .map(input -> String.format("\t\tON = %s [\n%s\t\t]", input,
                    this.inputs.get(input)
                            .stream()
                            .map(Outcome::toString)
                            .collect(Collectors.joining("\n\t\t\tOR\n\n"))))
                .collect(Collectors.joining("\n"));
    }

    public void printAvailableInputs() {
        System.out.printf("Available inputs: [%s]\n", String.join(", ",this.inputs.keySet()));
    }
}
