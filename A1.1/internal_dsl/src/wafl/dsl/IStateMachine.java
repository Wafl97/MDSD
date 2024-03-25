package wafl.dsl;

import java.util.function.Supplier;

public interface IStateMachine<T> {
    T given(String state);
    T when(String input);
    T and(Supplier<Boolean> condition);
    T then(Runnable callback);
    T then(String nextState);
    T end();
    T start(String initialState);
}