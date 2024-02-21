package wafl;

import wafl.models.CdPlayer;
import wafl.models.CookingHood;
import wafl.models.MicrowaveOven;
import wafl.models.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Marc L. W. Bertelsen
 * @implNote
 * This is the implemented code for assignment 1 for the Model Driven Software Development.
 * The same statemachine API {@link wafl.v2.StateMachine} has been used for the three objects seen in the main function.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("""
                Select machine:
                1) Microwave Oven
                2) CD Player
                3) Cooking Hood
                Enter:\s""");
        String option = reader.readLine();
        Model m;
        switch (option) {
            case "1" -> m = new MicrowaveOven();
            case "2" -> m = new CdPlayer();
            case "3" -> m = new CookingHood();
            default -> {
                System.out.println("Not a valid option");
                return;
            }
        }

        System.out.println("Options: [(1)SHOW, (2)RUN, (3)BOTH]");
        System.out.print("Enter: ");
        option = reader.readLine();
        switch (option) {
            case "1","SHOW" -> System.out.println(m);
            case "2","RUN" -> m.run();
            case "3","BOTH" -> {
                System.out.println(m);
                m.run();
            }
            default -> {
                System.out.println("Not a valid option");
                return;
            }
        }
    }
}