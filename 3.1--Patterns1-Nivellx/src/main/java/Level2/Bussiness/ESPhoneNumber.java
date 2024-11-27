package Level2.Bussiness;

import Level2.Bussiness.Interfaces.PhoneNumber;

public class ESPhoneNumber implements PhoneNumber {
    private String phoneNumber;

    public ESPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
