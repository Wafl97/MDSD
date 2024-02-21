package wafl.models;

import wafl.v2.StateMachine;

import java.util.concurrent.atomic.AtomicBoolean;

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

    public MicrowaveOven() {
        System.out.println("MICROWAVE OVEN");
        AtomicBoolean doorOpen = new AtomicBoolean(false);

        this.stateMachine = new StateMachine()

                .when(INACTIVE)
                    .on(START)
                    .and(() -> !doorOpen.get())
                    .then(COOKING)
                .when(INACTIVE)
                    .on(CLOSE_DOOR)
                    .and(doorOpen::get)
                    .then(() -> doorOpen.set(false))

                .when(COOKING)
                    .on(TIMER)
                    .then(INACTIVE)
                .when(COOKING)
                    .on(STOP)
                    .then(INACTIVE)
                .when(COOKING)
                    .on(OPEN_DOOR)
                    .then(DOOR_OPEN)
                    .then(() -> doorOpen.set(true))

                .when(DOOR_OPEN)
                    .on(CLOSE_DOOR)
                    .then(() -> doorOpen.set(true))
                    .then(COOKING)
                .when(DOOR_OPEN)
                    .on(STOP)
                    .then(INACTIVE);
    }

    @Override
    public void run() {
        this.stateMachine.start(INACTIVE);;
    }

    @Override
    public String toString() {
        return this.stateMachine.toString();
    }
}
