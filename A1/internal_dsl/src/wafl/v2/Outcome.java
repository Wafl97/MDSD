package wafl.v2;

import java.util.Optional;

/**
 * @author Marc L. W. Bertelsen
 */
public class Outcome {

    private Condition condition;
    private String nextState;
    private Callback callback;

    private Outcome() {

    }

    public Optional<Condition> getCondition() {
        return Optional.ofNullable(this.condition);
    }

    public Optional<String> getNextState() {
        return Optional.ofNullable(this.nextState);
    }

    public Optional<Callback> getCallback() {
        return Optional.ofNullable(this.callback);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        this.getCondition().ifPresent((c) -> builder.append(String.format("\t\tAND = %s\n", c)));
        this.getNextState().ifPresent((s) -> builder.append(String.format("\t\tTHEN = %s\n", s)));
        this.getCallback().ifPresent((c) -> builder.append(String.format("\t\tTHEN = %s\n", c)));
        return builder.toString();
    }

    public static Builder newBuilder() {
        return new Builder();
    }
    public static class Builder {
        private final Outcome outcome;
        private Builder() {
            this.outcome = new Outcome();
        }

        public Builder nextState(String nextState) {
            this.outcome.nextState = nextState;
            return this;
        }

        public Builder condition(Condition condition) {
            this.outcome.condition = condition;
            return this;
        }

        public Builder callback(Callback callback) {
            this.outcome.callback = callback;
            return this;
        }

        public Outcome build() {
            return this.outcome;
        }
    }
}
