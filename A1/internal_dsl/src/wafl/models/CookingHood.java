package wafl.models;

import wafl.v2.StateMachine;

import java.util.concurrent.atomic.AtomicInteger;

public class CookingHood implements Model {

    private static final String OFF = "OFF";
    private static final String ON = "ON";
    private static final String MAX = "MAX";

    private static final String PLUS = "PLUS";
    private static final String MINUS = "MINUS";

    private final StateMachine stateMachine;

    public CookingHood() {
        System.out.println("COOKING HOOD");
        AtomicInteger power = new AtomicInteger(0);

        this.stateMachine = new StateMachine()

                .when(OFF)
                    .on(PLUS)
                    .then(ON)
                    .then(() -> power.set(1))

                .when(ON)
                    .on(MINUS)
                    .and(() -> power.get() == 1)
                    .then(OFF)
                .when(ON)
                    .on(PLUS)
                    .and(() -> power.get() == 6)
                    .then(MAX)
                .when(ON)
                    .on(PLUS)
                    .and(() -> power.get() < 6)
                    .then(power::getAndIncrement)
                .when(ON)
                    .on(MINUS)
                    .and(() -> power.get() == 1)
                    .then(OFF)
                .when(ON)
                    .on(MINUS)
                    .and(() -> power.get() > 0)
                    .then(power::getAndDecrement)

                .when(MAX)
                    .on(MINUS)
                    .then(ON)
                    .then(() -> power.set(6));
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
