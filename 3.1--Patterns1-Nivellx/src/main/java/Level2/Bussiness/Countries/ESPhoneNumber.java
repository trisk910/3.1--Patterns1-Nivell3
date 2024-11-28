package Level2.Bussiness.Countries;

import Level2.Bussiness.Interfaces.PhoneNumber;

public class ESPhoneNumber implements PhoneNumber {
    private String number;

    public ESPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String getPhoneNumber() {
        return "+34 " + number;
    }
}