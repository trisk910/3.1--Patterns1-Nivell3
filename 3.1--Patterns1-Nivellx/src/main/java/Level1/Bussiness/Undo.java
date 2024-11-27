package Level1.Bussiness;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;
    private List<String> commandHistory;

    private Undo() {
        commandHistory = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        commandHistory.add(command);
    }

    public void listCommands() {
        if (commandHistory.isEmpty()) {
            System.out.println("No commands to show.");
        } else {
            commandHistory.forEach(System.out::println);
        }
    }
    public void clearHistory() {
        commandHistory.clear();
    }
}
