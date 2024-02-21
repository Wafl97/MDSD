package wafl.v1;

import java.util.ArrayList;
import java.util.List;

public class InputLogic {

    private String inputString;
    private List<StateMachine.Condition> conditions;
    private String nextState;
    private StateMachine.Callback callback;

    private InputLogic() {
        this.conditions = new ArrayList<>();
    }

    public String getInputString() {
        return this.inputString;
    }

    public List<StateMachine.Condition> getConditions() {
        return this.conditions;
    }

    public String getNextState() {
        return nextState;
    }

    public StateMachine.Callback getCallback() {
        return this.callback;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
    public static class Builder {

        private final InputLogic inputLogic;
        private Builder() {
            this.inputLogic = new InputLogic();
        }

        public Builder inputString(String input) {
            this.inputLogic.inputString = input;
            return this;
        }

        public Builder condition(StateMachine.Condition condition) {
            if (this.inputLogic.inputString == null) {
                this.inputLogic.inputString = "condition";
            }
            this.inputLogic.conditions.add(condition);
            return this;
        }

        public Builder nextState(String nextState) {
            this.inputLogic.nextState = nextState;
            return this;
        }

        public Builder callback(StateMachine.Callback callback) {
            this.inputLogic.callback = callback;
            return this;
        }

        public InputLogic build() {
            return this.inputLogic;
        }
    }
}
