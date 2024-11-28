package Level2.Bussiness.Countries;

import Level2.Bussiness.Interfaces.Address;

public class FRAddress implements Address {
    private String street;
    private String city;
    private String postcode;

    public FRAddress(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    @Override
    public String getFullAddress() {
        return street + ", " + city + ", " + postcode;
    }
}

