package Level2.Presentation;

import Level2.Bussiness.Agenda;
import Level2.Bussiness.Countries_Factory.ESFactory;
import Level2.Bussiness.Countries_Factory.FRFactory;
import Level2.Bussiness.Interfaces.ContactFactory;

import java.util.Scanner;

public class MainMenu {
    private Scanner scanner = new Scanner(System.in);
    private final String[] menu = {"Add a new contact", "List all contacts", "Exit"};
    private Agenda agenda = new Agenda();

    private void displayMenu(){
        for(int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
        System.out.print("-> ");
    }

    public void showMainMenu() {
        int option;
        do {
            displayMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    agenda.listContacts();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 3);
    }

    private void addContact() {
        ContactFactory factory = null;
        boolean validCountry = false;
        do{
            System.out.print("Enter country (ES/FR): ");
            String country = scanner.nextLine().toUpperCase();
            switch (country) {
                case "ES":
                    factory = new ESFactory();
                    validCountry = true;
                    break;
                case "FR":
                    factory = new FRFactory();
                    validCountry = true;
                    break;
                default:
                    System.out.println("Country not on the list.");
            }
        }while (!validCountry);
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state: ");
        String stateOrPostcode = scanner.nextLine();
        System.out.print("Enter zip: ");
        String zipOrPostcode = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String number = scanner.nextLine();

        agenda.addContact(factory, street, city, stateOrPostcode, zipOrPostcode, number);
        System.out.println("Contact added.");
    }
}
