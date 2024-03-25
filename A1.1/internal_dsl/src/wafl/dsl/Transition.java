package wafl.dsl;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Marc L. W. Bertelsen
 */
public class Transition {

    private Supplier<Boolean> condition;
    private String nextState;
    private Runnable callback;
    private boolean terminate;

    private Transition() {
        this.terminate = false;
    }

    public Optional<Supplier<Boolean>> getCondition() {
        return Optional.ofNullable(this.condition);
    }

    public Optional<String> getNextState() {
        return Optional.ofNullable(this.nextState);
    }

    public Optional<Runnable> getCallback() {
        return Optional.ofNullable(this.callback);
    }

    public boolean terminate() {
        return this.terminate;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        this.getCondition().ifPresent((c) -> builder.append(String.format("\t\t\tAND = (condition) %s\n", c)));
        this.getNextState().ifPresent((s) -> builder.append(String.format("\t\t\tTHEN = %s\n", s)));
        this.getCallback().ifPresent((c) -> builder.append(String.format("\t\t\tTHEN = (callback) %s\n", c)));
        if (this.terminate()) {
            builder.append("\t\t\tEND\n");
        }
        return builder.toString();
    }

    public static Builder newBuilder() {
        return new Builder();
    }
    public static class Builder {
        private final Transition transition;
        private Builder() {
            this.transition = new Transition();
        }

        public Builder nextState(String nextState) {
            this.transition.nextState = nextState;
            return this;
        }

        public Builder condition(Supplier<Boolean> condition) {
            this.transition.condition = condition;
            return this;
        }

        public Builder callback(Runnable callback) {
            this.transition.callback = callback;
            return this;
        }

        public Builder terminate() {
            this.transition.terminate = true;
            return this;
        }

        public Transition build() {
            return this.transition;
        }
    }
}
