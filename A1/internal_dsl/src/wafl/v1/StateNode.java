package wafl.v1;

import java.util.*;

public class StateNode {

    private String name;

    private Map<String, InputLogic> inputLogicMap;

    private StateNode() {
        this.inputLogicMap = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void appendNode(StateNode stateNode) {
        stateNode.inputLogicMap.forEach((key,value) -> {
            this.inputLogicMap.putIfAbsent(key,value);
        });
    }

    public void addInputLogic(String input, InputLogic inputLogic) {
        //System.out.printf("Adding input (%s) to node (%s)\n", input, this.name);
        this.inputLogicMap.putIfAbsent(input, inputLogic);
    }

    public void addInputLogic(String input, InputLogic.Builder inputLogicBuilder) {
        this.addInputLogic(input, inputLogicBuilder.build());
    }

    public boolean checkConditions() {

        return false;
    }

    public boolean hasInput(String input) {
        return this.inputLogicMap.containsKey(input);
    }

    public boolean hasAllConditionsMet(String input) {
        if (this.hasInput(input)) {
            for (StateMachine.Condition condition : this.inputLogicMap.get(input).getConditions()) {
                if (!condition.check()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public String getNextState(String input) {
        return this.inputLogicMap.get(input).getNextState();
    }

    public StateMachine.Callback getCallback(String input) {
        return this.inputLogicMap.get(input).getCallback();
    }

    public static Builder newBuilder() {
        return new Builder();
    }
    public static class Builder {
        private final StateNode stateNode;


        private String tmp;
        private Builder() {
            this.stateNode = new StateNode();
        }
        public String getNodeName() {
            return this.stateNode.name;
        }

        public Builder state(String state) {
            this.stateNode.name = state;
            return this;
        }

        public StateNode build() {
            return this.stateNode;
        }
    }
}
