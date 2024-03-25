package wafl.models;

import wafl.dsl.StateMachine;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Marc L. W. Bertelsen
 */
public class MicrowaveOven implements Model {

    private static final String INACTIVE = "INACTIVE";
    private static final String COOKING = "COOKING";
    private static final String DOOR_OPEN = "DOOR OPEN";

    private static final String START = "START";
    private static final String STOP = "STOP";
    private static final String OPEN_DOOR = "OPEN DOOR";
    private static final String CLOSE_DOOR = "CLOSE DOOR";
    private static final String TIMER = "TIMER";

    private final StateMachine stateMachine;

    private boolean doorOpen;

    public MicrowaveOven() {
        this.doorOpen = false;

        this.stateMachine = new StateMachine("MICROWAVE OVEN")

                .given(INACTIVE)
                    .when(START)
                    .and(() -> !doorOpen)
                    .then(COOKING)

                .given(COOKING)
                    .when(TIMER)
                    .then(INACTIVE)

                    .when(STOP)
                    .then(INACTIVE)

                    .when(OPEN_DOOR)
                    .then(DOOR_OPEN)
                    .then(() -> doorOpen = true)

                .given(DOOR_OPEN)
                    .when(CLOSE_DOOR)
                    .then(() -> doorOpen = true)
                    .then(COOKING)

                    .when(STOP)
                    .then(INACTIVE);
    }

    @Override
    public void run() {
        this.stateMachine.start(INACTIVE);
    }

    @Override
    public String toString() {
        return this.stateMachine.toString();
    }
}
