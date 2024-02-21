package wafl;

import wafl.models.CdPlayer;
import wafl.models.CookingHood;
import wafl.models.MicrowaveOven;
import wafl.models.Model;
import wafl.v2.PrintMode;
import wafl.v2.StateMachine;

/**
 * @author Marc L. W. Bertelsen
 * @implNote
 * This is the implemented code for assignment 1 for the Model Driven Software Development.
 * The same statemachine API {@link wafl.v2.StateMachine} has been used for the three objects seen in the main function.
 */
public class Main {

    public static void main(String[] args) {

        Model microwaveOven = new MicrowaveOven();
        Model cdPlayer = new CdPlayer();
        Model cookingHood = new CookingHood();

        // make a statemachine for the statemachines
        StateMachine mainMenu = new StateMachine("MAIN");
        mainMenu
                .when("MENU")
                    .on("MODELS")
                    .then("SELECT MACHINE")
                .when("MENU")
                    .on("DEBUG")
                    .then("DEBUG MENU")
                .when("MENU")
                    .on("EXIT")
                    .end()

                .when("SELECT MACHINE")
                    .on("MICROWAVE OVEN")
                    .then(microwaveOven::run)
                    .end()
                .when("SELECT MACHINE")
                    .on("CD PLAYER")
                    .then(cdPlayer::run)
                    .end()
                .when("SELECT MACHINE")
                    .on("COOKING HOOD")
                    .then(cookingHood::run)
                    .end()

                .when("DEBUG MENU")
                    .on("BACK")
                    .then("MENU")
                .when("DEBUG MENU")
                    .on("MAIN")
                    .then(() -> System.out.println(mainMenu))
                .when("DEBUG MENU")
                    .on("MICROWAVE OVEN")
                    .then(() -> System.out.println(microwaveOven))
                .when("DEBUG MENU")
                    .on("CD PLAYER")
                    .then(() -> System.out.println(cdPlayer))
                .when("DEBUG MENU")
                    .on("COOKING HOOD")
                    .then(() -> System.out.println(cookingHood))

                .spawnTread()
                .start("MENU");
    }
}