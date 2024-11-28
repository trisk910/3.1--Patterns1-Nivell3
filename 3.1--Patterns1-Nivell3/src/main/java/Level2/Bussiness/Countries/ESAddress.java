package Level2.Bussiness.Countries;

import Level2.Bussiness.Interfaces.Address;

public class ESAddress implements Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public ESAddress(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String getFullAddress() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
