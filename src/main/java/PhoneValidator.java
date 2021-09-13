public class PhoneValidator {

    public boolean validatePhone(String phone) {
        String prefix ="+370";
        int minLength = 10;

        return phoneContainsNumbersOnly(phone) && phoneStartsWith(phone, prefix) && phoneLengthCorrect(phone, minLength);
    }

    private boolean phoneContainsNumbersOnly(String phone) {
        return false;
    }

    private boolean phoneStartsWith(String phone, String prefix) {
        return false;
    }

    private boolean phoneLengthCorrect(String phone, int minLength) {
        return false;
    }
}
