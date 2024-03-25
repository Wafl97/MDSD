package wafl.dsl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {

    public Parser() {}

    public StateMachine parse(String fileName) {
        File file = new File(fileName);
        StringBuilder builder = new StringBuilder();
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                builder.append(reader.nextLine()).append("\n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String[] lines = builder.toString().split("\n");
        return this.parse(lines);
    }

    public StateMachine parse(String[] lines) {
        String name;
        try {
            name = lines[0].split("model ")[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Missing model name");
            return null;
        }
        final StateMachine sm = new StateMachine(name);
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].strip();
            if (line.startsWith("state")) {
                sm.given(line.split("state ")[1]);
                continue;
            }
            if (line.startsWith("initial")) {
                sm.start(line.split("initial ")[1]);
                continue;
            }
            String[] words = line.split(" ");
            if (words[1].equals("end")) {
                sm.when(words[0]).end();
                continue;
            }
            sm.when(words[0]).then(words[2]);
        }
        return sm;
    }

    public void parseAndRun(String fileName) {
        StateMachine sm = this.parse(fileName);
        sm.run();
    }

    public void parseAndRun(String[] lines) {
        StateMachine sm = this.parse(lines);
        sm.run();
    }
}
