package Level2.Bussiness.Interfaces;

public interface ContactFactory {
    Address createAddress(String street, String city, String stateOrPostcode, String zipOrPostcode);
    PhoneNumber createPhoneNumber(String number);
}
