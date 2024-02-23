package wafl.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import wafl.dsl.StateMachine;

/**
 * @author Marc L. W. Bertelsen
 */
public class CdPlayer implements Model {

    private static final String STOPPED = "STOPPED";
    private static final String PLAYING = "PLAYING";
    private static final String PAUSED = "PAUSED";

    private static final String PLAY = "PLAY";
    private static final String STOP = "STOP";
    private static final String PAUSE = "PAUSE";
    private static final String FORWARD = "FORWARD";
    private static final String BACKWARD = "BACKWARD";

    private final StateMachine stateMachine;

    private int trackIndex;
    private final List<String> trackQueue;

    public CdPlayer() {
        this.trackQueue = new ArrayList<>(){{
            add("Track_1");add("Track_2");add("Track_3");add("Track_4");add("Track_5");
        }};
        this.trackIndex = 0;

        this.stateMachine = new StateMachine("CD PLAYER")

                .given(STOPPED)
                    .when(PLAY)
                    .and(() -> !trackQueue.isEmpty() && trackIndex < trackQueue.size())
                    .then(PLAYING)

                    .when(FORWARD)
                    .then(() -> trackIndex++)

                    .when(BACKWARD)
                    .then(() -> trackIndex--)

                .given(PLAYING)
                    .when(STOP)
                    .then(STOPPED)
                    .then(() -> trackIndex = 0)

                    .when(PAUSE)
                    .then(PAUSED)

                .given(PAUSED)
                    .when(PLAY)
                    .then(PLAYING)

                    .when(STOP)
                    .then(STOPPED)
                    .then(() -> trackIndex = 0)

                    .when(FORWARD)
                    .then(() -> trackIndex++)

                    .when(BACKWARD)
                    .then(() -> trackIndex--);
    }

    @Override
    public void run() {
        this.stateMachine.start(STOPPED);
    }

    @Override
    public String toString() {
        return this.stateMachine.toString();
    }
}
