package wafl.dsl;

public interface IStateMachine<T> {
    T given(String state);
    T when(String input);
    T and(Condition condition);
    T then(Callback callback);
    T then(String nextState);
    T end();
    T start(String initialState);
}