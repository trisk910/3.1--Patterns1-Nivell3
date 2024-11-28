package Level2.Bussiness.Countries;

import Level2.Bussiness.Interfaces.PhoneNumber;

public class FRPhoneNumber implements PhoneNumber {
    private String number;

    public FRPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String getPhoneNumber() {
        return "+33 " + number;
    }
}
