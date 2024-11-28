package Level2.Bussiness.Countries_Factory;

import Level2.Bussiness.Countries.ESAddress;
import Level2.Bussiness.Countries.ESPhoneNumber;
import Level2.Bussiness.Countries.FRPhoneNumber;
import Level2.Bussiness.Interfaces.Address;
import Level2.Bussiness.Interfaces.ContactFactory;
import Level2.Bussiness.Interfaces.PhoneNumber;

public class FRFactory implements ContactFactory {
    @Override
    public Address createAddress(String street, String city, String state, String zip) {
        return new ESAddress(street, city, state, zip);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new FRPhoneNumber(number);
    }
}
