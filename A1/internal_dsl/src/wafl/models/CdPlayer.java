package wafl.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import wafl.v2.StateMachine;

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

    public CdPlayer() {
        List<String> trackQueue = new ArrayList<>(){{
            add("Track_1");add("Track_2");add("Track_3");add("Track_4");add("Track_5");
        }};
        AtomicInteger trackIndex = new AtomicInteger(0);

        this.stateMachine = new StateMachine("CD PLAYER")

                .when(STOPPED)
                    .on(PLAY)
                    .and(() -> !trackQueue.isEmpty() && trackIndex.get() < trackQueue.size())
                    .then(PLAYING)

                    .on(FORWARD)
                    .then(trackIndex::getAndIncrement)

                    .on(BACKWARD)
                    .then(trackIndex::getAndDecrement)

                .when(PLAYING)
                    .on(STOP)
                    .then(STOPPED)
                    .then(() -> trackIndex.set(0))

                    .on(PAUSE)
                    .then(PAUSED)

                .when(PAUSED)
                    .on(PLAY)
                    .then(PLAYING)

                    .on(STOP)
                    .then(STOPPED)
                    .then(() -> trackIndex.set(0))

                    .on(FORWARD)
                    .then(trackIndex::getAndIncrement)

                    .on(BACKWARD)
                    .then(trackIndex::getAndDecrement);
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
