package Level2.Bussiness;

import Level2.Bussiness.Interfaces.Address;
import Level2.Bussiness.Interfaces.ContactFactory;
import Level2.Bussiness.Interfaces.PhoneNumber;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
    private List<Address> addresses = new ArrayList<>();
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public void addContact(ContactFactory factory, String street, String city, String stateOrPostcode, String zipOrPostcode, String number) {
        addresses.add(factory.createAddress(street, city, stateOrPostcode, zipOrPostcode));
        phoneNumbers.add(factory.createPhoneNumber(number));
    }

    public void listContacts() {
        if(addresses.isEmpty() && phoneNumbers.isEmpty()) {
            System.out.println("No contacts found");
        }else {
            System.out.println("Addresses:");
            addresses.forEach(address -> System.out.println(address.getFullAddress()));
            System.out.println("Phone Numbers:");
            phoneNumbers.forEach(phone -> System.out.println(phone.getPhoneNumber()));
        }
    }
}
