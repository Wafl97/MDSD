package wafl.models;

import wafl.dsl.StateMachine;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Marc L. W. Bertelsen
 */
public class CookingHood implements Model {

    private static final String OFF = "OFF";
    private static final String ON = "ON";
    private static final String MAX = "MAX";

    private static final String PLUS = "PLUS";
    private static final String MINUS = "MINUS";

    private final StateMachine stateMachine;

    private int power;

    public CookingHood() {
        this.power = 0;

        this.stateMachine = new StateMachine("COOKING HOOD")

                .given(OFF)
                    .when(PLUS)
                    .then(ON)
                    .then(() -> power = 1)

                .given(ON)
                    .when(PLUS)
                    .and(() -> power == 6)
                    .then(MAX)

                    .when(PLUS)
                    .and(() -> power < 6)
                    .then(() -> power++)

                    .when(MINUS)
                    .and(() -> power == 1)
                    .then(OFF)

                    .when(MINUS)
                    .and(() -> power > 0)
                    .then(() -> power--)

                .given(MAX)
                    .when(MINUS)
                    .then(ON)
                    .then(() -> power = 6);
    }

    @Override
    public void run() {
        this.stateMachine.start(OFF);
    }

    @Override
    public String toString() {
        return this.stateMachine.toString();
    }
}
