package Level1.Presentation;

import java.util.Scanner;

public class MainMenu {
    private final String[] commands =
            {"Add a new command", "List all commands","Clear history", "Exit"};
    private final Undo undo = Undo.getInstance();
    private final Scanner scanner = new Scanner(System.in);

    private void displayMenu() {
        for(int i = 0; i < commands.length; i++) {
            System.out.println(i + 1 + ". " + commands[i]);
        }
        System.out.print("> ");
    }
    public void showMenu() {
        int option;
        do {
            displayMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    String command = introCommand();
                    undo.addCommand(command);
                    break;
                case 2:
                    undo.listCommands();
                    break;
                case 3:
                    clearHistory();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
    }

    private String introCommand() {
        System.out.println("Enter a command: ");
        System.out.print("> ");
        return scanner.nextLine();
    }

    private void clearHistory() {
        undo.clearHistory();
        System.out.println("History cleared.");
    }
}
