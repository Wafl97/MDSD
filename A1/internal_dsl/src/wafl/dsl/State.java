package wafl.dsl;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Marc L. W. Bertelsen
 */
public class State {

    private final String name;
    private final Map<String, Set<Transition>> transitions;

    public State(String name) {
        this.name = name;
        this.transitions = new HashMap<>();
    }

    public void appendInput(String input, Transition transition) {
        if (!this.transitions.containsKey(input)) {
            this.transitions.put(input, new HashSet<>(){{add(transition);}});
            return;
        }
        this.transitions.get(input).add(transition);

    }

    public String getName() {
        return this.name;
    }

    public Optional<String> getNextState(String input) {
        // Check all conditions are met
        if (!this.transitions.containsKey(input)) {
            //System.out.printf("%s not found\n", input);
            return Optional.empty();
        }
        //System.out.printf("%s found checking conditions ... ", input);
        for (Transition transition : this.transitions.get(input)) {
            Optional<Supplier<Boolean>> condition = transition.getCondition();
            if (condition.isEmpty()) {
                //System.out.print(" success\n");
                return transition.getNextState();
            }
            if (condition.get().get()) {
                //System.out.print(" success\n");
                return transition.getNextState();
            }
        }
        //System.out.print(" failure\n");
        return Optional.empty();
    }

    public Optional<Runnable> getCallback(String input) {
        // Check all conditions are met
        if (!this.transitions.containsKey(input)) {
            //System.out.printf("%s not found\n", input);
            return Optional.empty();
        }
        //System.out.printf("%s found checking conditions ... ", input);
        for (Transition transition : this.transitions.get(input)) {
            Optional<Supplier<Boolean>> condition = transition.getCondition();
            if (condition.isEmpty()) {
                //System.out.print(" success\n");
                return transition.getCallback();
            }
            if (condition.get().get()) {
                //System.out.print(" success\n");
                return transition.getCallback();
            }
        }
        //System.out.print(" failure\n");
        return Optional.empty();
    }

    public boolean willTerminate(String input) {
        // Check all conditions are met
        if (!this.transitions.containsKey(input)) {
            //System.out.printf("%s not found\n", input);
            return false;
        }
        //System.out.printf("%s found checking conditions ... ", input);
        for (Transition transition : this.transitions.get(input)) {
            Optional<Supplier<Boolean>> condition = transition.getCondition();
            if (condition.isEmpty()) {
                //System.out.print(" success\n");
                return transition.terminate();
            }
            if (condition.get().get()) {
                //System.out.print(" success\n");
                return transition.terminate();
            }
        }
        //System.out.print(" failure\n");
        return false;
    }

    @Override
    public String toString() {
        return this.transitions.keySet()
                .stream()
                .map(input -> String.format("\t\tON = %s [\n%s\t\t]", input,
                    this.transitions.get(input)
                            .stream()
                            .map(Transition::toString)
                            .collect(Collectors.joining("\n\t\t\tOR\n\n"))))
                .collect(Collectors.joining("\n"));
    }

    public void printAvailableInputs() {
        System.out.printf("Available input(s): [%s]\n", String.join(", ",this.transitions.keySet()));
    }
}
