package Level3.Presentation;

import Level3.Bussiness.Bicycle;
import Level3.Bussiness.Boat;
import Level3.Bussiness.Car;
import Level3.Bussiness.Commands.Accelerate;
import Level3.Bussiness.Commands.Brake;
import Level3.Bussiness.Commands.StartCommand;
import Level3.Bussiness.Interfaces.Vehicle;
import Level3.Bussiness.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private Scanner scanner = new Scanner(System.in);
    private final String[] mainMenu = {"List vehicles", "Command vehicles", "Exit"};
    private final String[] vehicles = {"Bicycle", "Boat", "Car", "Plane"};
    private final String[] commands = {"Start", "Accelerate", "Brake"};
    private List<Vehicle> vehicleList = new ArrayList<>();

    private void initializeVehicles() {
        vehicleList.add(new Bicycle());
        vehicleList.add(new Boat());
        vehicleList.add(new Car());
        vehicleList.add(new Plane());
    }
    private void displayMenu(String[] menu) {
        for (int i = 0; i < menu.length; i++)
            System.out.println(i + 1 + ". " + menu[i]);
    }

    public void showMainMenu() {
        initializeVehicles();
        int option;
        do {
            displayMenu(mainMenu);
            System.out.print("-> ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    displayMenu(vehicles);
                    System.out.println("--------------------");
                    break;
                case 2:
                    commandVehicles();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 3);
    }
    private void commandVehicles(){
        int vehicleOption;
            do{
                System.out.println("Choose a vehicle: ");
                displayMenu(vehicles);
                System.out.print("-> ");
                vehicleOption = scanner.nextInt();
                scanner.nextLine();
                    switch (vehicleOption) {
                        case 1:
                            System.out.println("Bicycle selected");
                            break;
                        case 2:
                            System.out.println("Boat selected");
                            break;
                        case 3:
                            System.out.println("Car selected");
                            break;
                        case 4:
                            System.out.println("Plane selected");
                            break;
                        default:
                            System.out.println("Invalid vehicle. Please try again.");
                }
            }while(vehicleOption < 1 || vehicleOption > vehicles.length);
            Vehicle vehicle = vehicleList.get(vehicleOption - 1);
            System.out.println("Choose a command: ");
            displayMenu(commands);
            System.out.print("-> ");
            int commandOption = scanner.nextInt();
            scanner.nextLine();

            switch (commandOption) {
                case 1:
                    new StartCommand(vehicle).execute();
                    break;
                case 2:
                    new Accelerate(vehicle).execute();
                    break;
                case 3:
                    new Brake(vehicle).execute();
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
    }
}
