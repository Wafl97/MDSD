import org.junit.Assert;
import org.junit.Test;
import wafl.dsl.PrintMode;
import wafl.dsl.StateMachine;

import java.util.*;
import java.util.function.Supplier;

import static org.junit.Assert.*;

public class ModelTest {

    @Test
    public void genericModelTest() {
        final Queue<String> simulatedInputs = new LinkedList<>()
        {{
            add("A"); // Expect nothing
            add("B"); // Expect state change to "S_B"
            add("B"); // Expect nothing
            add("C"); // Expect nothing
            add("A"); // Expect state change to "S_A"
            add("C"); // Expect end
        }};
        final List<String> simulatedOutputs = new LinkedList<>();
        final List<String> expectedOutputs = new LinkedList<>()
        {{
            add("S_A"); // Initial state
            add("S_B");
            add("S_A");
            // END
        }};

        new StateMachine("GENERIC MODEL") // Create a new statemachine for a model called "TEST"
                .printMode(PrintMode.TESTING) // Limit the outputs to only the current state of the model
                .i(simulatedInputs::poll).o(simulatedOutputs::add) // set IO for the statemachine

                // When the model is in state "S_A" and is given "B" as input it should change state to "S_B"
                .given("S_A")
                    .when("B")
                    .then("S_B")
                // When the model is in state "S_AB" and is given "C" as input it should end and run the callback
                .given("S_A")
                    .when("C")
                    .end()
                // When the model is in state "S_B" and is given "A" as input it should change state to "S_A"
                .given("S_B")
                    .when("A")
                    .and(() -> true) // Simulated additional condition that must be met to change state
                    .then("S_A")
                    .then(() -> assertTrue(true))
                // This should never get activated
                .given("S_B")
                    .when("B")
                    .and(() -> false) // Should prevent this outcome from happening
                    .then("NEVER")
                    .then(Assert::fail)

                // The model should have the initial state "S_A"
                .start("S_A"); // This will block until model has terminated

        // Check expected and simulated have same size
        assertEquals(expectedOutputs.size(), simulatedOutputs.size());

        // Check the order is the same
        assertArrayEquals(expectedOutputs.toArray(), simulatedOutputs.toArray());
    }

    @Test
    public void whenOnThenTest() {
        final Queue<String> simulatedInputs = new LinkedList<>()
        {{
            add("B"); // Expect state change to "S_B"
            add("C"); // Expect end
        }};
        final List<String> simulatedOutputs = new LinkedList<>();
        final List<String> expectedOutputs = new LinkedList<>()
        {{
            add("S_A"); // Initial state
            add("S_B");
            // END
        }};
        new StateMachine("WHEN ON THEN")
                .printMode(PrintMode.TESTING) // Limit the outputs to only the current state of the model
                .i(simulatedInputs::poll).o(simulatedOutputs::add) // set IO for the statemachine

                .given("S_A")
                    .when("B")
                    .then("S_B")

                .given("S_B")
                    .when("C")
                    .end()

                .start("S_A");

        // Check expected and simulated have same size
        assertEquals(expectedOutputs.size(), simulatedOutputs.size());

        // Check the order is the same
        assertArrayEquals(expectedOutputs.toArray(), simulatedOutputs.toArray());
    }

    @Test
    public void whenOnAndThenTest() {
        final Queue<String> simulatedInputs = new LinkedList<>()
        {{
            add("A"); // Expect nothing
            add("B"); // Expect state change to "S_B"
            add("C"); // Expect end
        }};
        final List<String> simulatedOutputs = new LinkedList<>();
        final List<String> expectedOutputs = new LinkedList<>()
        {{
            add("S_A"); // Initial state
            add("S_B");
            // END
        }};
        new StateMachine("WHEN ON THEN")
                .printMode(PrintMode.TESTING) // Limit the outputs to only the current state of the model
                .i(simulatedInputs::poll).o(simulatedOutputs::add) // set IO for the statemachine

                .given("S_A")
                    .when("A")
                    .and(() -> false)
                    .then("NEVER")
                .given("S_A")
                    .when("B")
                    .and(() -> true)
                    .then("S_B")

                .given("S_B")
                    .when("C")
                    .end()

                .start("S_A");

        // Check expected and simulated have same size
        assertEquals(expectedOutputs.size(), simulatedOutputs.size());

        // Check the order is the same
        assertArrayEquals(expectedOutputs.toArray(), simulatedOutputs.toArray());
    }

    @Test
    public void whenOnAndThenThenTest() {
        final Queue<String> simulatedInputs = new LinkedList<>()
        {{
            add("A"); // Expect nothing
            add("B"); // Expect state change to "S_B"
            add("C"); // Expect end
        }};
        final List<String> simulatedOutputs = new LinkedList<>();
        final List<String> expectedOutputs = new LinkedList<>()
        {{
            add("S_A"); // Initial state
            add("S_B");
            // END
        }};
        new StateMachine("WHEN ON THEN")
                .printMode(PrintMode.TESTING) // Limit the outputs to only the current state of the model
                .i(simulatedInputs::poll).o(simulatedOutputs::add) // set IO for the statemachine

                .given("S_A")
                    .when("A")
                    .and(() -> false)
                    .then("NEVER")
                    .then(Assert::fail)
                .given("S_A")
                    .when("B")
                    .and(() -> true)
                    .then("S_B")
                    .then(() -> assertTrue(true))

                .given("S_B")
                    .when("C")
                    .end()

                .start("S_A");

        // Check expected and simulated have same size
        assertEquals(expectedOutputs.size(), simulatedOutputs.size());

        // Check the order is the same
        assertArrayEquals(expectedOutputs.toArray(), simulatedOutputs.toArray());
    }

    @Test
    public void badInitialStateTest() {
        final Queue<String> simulatedInputs = new LinkedList<>();
        final List<String> simulatedOutputs = new LinkedList<>();
        final List<String> expectedOutputs = new LinkedList<>()
        {{
            add("ERROR - END");
            // END
        }};

        new StateMachine("BAD")
                .i(simulatedInputs::poll).o(simulatedOutputs::add)
                .printMode(PrintMode.TESTING)
                .given("S_A")
                    .when("B")
                    .then("S_B") // does not exist

                    .when("X")
                    .end()

                .start("S_X");

        // Check expected and simulated have same size
        assertEquals(expectedOutputs.size(), simulatedOutputs.size());

        // Check the order is the same
        assertArrayEquals(expectedOutputs.toArray(), simulatedOutputs.toArray());
    }

    @Test
    public void badStateChangeTest() {
        final Queue<String> simulatedInputs = new LinkedList<>()
        {{
            add("B"); // Expect reset
            add("X");
            // END
        }};
        final List<String> simulatedOutputs = new LinkedList<>();
        final List<String> expectedOutputs = new LinkedList<>()
        {{
            add("S_A"); // Initial state
            add("ERROR - RESET");
            // END
        }};

        new StateMachine("BAD")
                .i(simulatedInputs::poll).o(simulatedOutputs::add)
                .printMode(PrintMode.TESTING)
                .given("S_A")
                    .when("B")
                    .then("S_B") // does not exist

                    .when("X")
                    .end()

                .start("S_A");

        // Check expected and simulated have same size
        assertEquals(expectedOutputs.size(), simulatedOutputs.size());

        // Check the order is the same
        assertArrayEquals(expectedOutputs.toArray(), simulatedOutputs.toArray());
    }

    @Test
    public void abstractSyntaxTest() {

        Supplier<Boolean> con = () -> true;

        Runnable call = () -> {};

        // Test that it is consistent
        for (int i = 0; i < 10; i++) {
            StateMachine stateMachine = new StateMachine("TEST")
                    .given("S_A")
                        .when("B")
                        .then("S_B")

                        .when("X")
                        .and(con)
                        .end()

                    .given("S_B")
                        .when("A")
                        .then("S_A")
                        .then(call)

                        .when("Y")
                        .then(call);

            String expected = String.format("""
                MODEL = TEST {
                \tWHEN = S_A [
                \t\tON = B [
                \t\t\tTHEN = S_B
                \t\t]
                \t\tON = X [
                \t\t\tAND = (condition) %s
                \t\t\tEND
                \t\t]
                \t]
                \tWHEN = S_B [
                \t\tON = A [
                \t\t\tTHEN = S_A
                \t\t\tTHEN = (callback) %s
                \t\t]
                \t\tON = Y [
                \t\t\tTHEN = (callback) %s
                \t\t]
                \t]
                }""", con, call, call);

            assertEquals(expected, stateMachine.toString());
        }
    }
}
