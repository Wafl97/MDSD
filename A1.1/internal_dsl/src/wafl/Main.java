package wafl;

import wafl.dsl.Parser;
import wafl.dsl.State;
import wafl.models.CdPlayer;
import wafl.models.CookingHood;
import wafl.models.MicrowaveOven;
import wafl.models.Model;
import wafl.dsl.StateMachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Marc L. W. Bertelsen
 * @implNote
 * This is the implemented code for assignment 1 for the Model Driven Software Development.
 * The same {@link wafl.dsl.StateMachine API} has been used for the three objects seen in the main function.
 * <br/>
 * The main function also contains a statemachine.
 * It allows for looking at the abstract syntax of the three "machines" and itself, by using the "DEBUG MENU",
 * additionally it also allows for selecting and running each of the three "machines"
 */
public class Main {

    public static void main(String[] args) {
        //runA1();
        runA1_1();
    }

    public static void runA1_1() {
        Parser p = new Parser();
        StateMachine sm = p.parse("./state_machine.wodel");
        System.out.println(sm.toString());
        sm.run();
    }
    public static void runA1() {
        Model microwaveOven = new MicrowaveOven();
        Model cdPlayer = new CdPlayer();
        Model cookingHood = new CookingHood();

        // make a statemachine for the statemachines
        StateMachine mainMenu = new StateMachine("MAIN");
        mainMenu
                .given("MAIN MENU")

                .when("MODELS")
                .then("SELECT MACHINE")

                .when("DEBUG")
                .then("DEBUG MENU")

                .when("EXIT")
                .end()

                .given("SELECT MACHINE")
                .when("MICROWAVE OVEN")
                .then(microwaveOven::run)
                .end()

                .when("CD PLAYER")
                .then(cdPlayer::run)
                .end()

                .when("COOKING HOOD")
                .then(cookingHood::run)
                .end()

                .given("DEBUG MENU")
                .when("BACK")
                .then("MAIN MENU")

                .when("MAIN")
                .then(() -> System.out.println(mainMenu))

                .when("MICROWAVE OVEN")
                .then(() -> System.out.println(microwaveOven))

                .when("CD PLAYER")
                .then(() -> System.out.println(cdPlayer))

                .when("COOKING HOOD")
                .then(() -> System.out.println(cookingHood))

                .spawnTread()
                .start("MAIN MENU");
    }
}