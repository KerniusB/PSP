import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneValidatorTest {
    PhoneValidator phoneValidator = new PhoneValidator();

    @Test
    void phoneContainsNumbersOnly_shouldPass() {
        String phone = "+37000000000";

        boolean result = phoneValidator.validatePhone(phone);

        assertTrue(result);
    }

    @Test
    void phoneContainsNumbersOnly_shouldFail() {
        String phone = "+3700000000a";

        boolean result = phoneValidator.validatePhone(phone);

        assertTrue(result);
    }

    @Test
    void phoneStartsWith_shouldPass() {
        String phone = "+37000000000";

        boolean result = phoneValidator.validatePhone(phone);

        assertTrue(result);
    }

    @Test
    void phoneStartsWith_shouldFail() {
        String phone = "-37000000000";

        boolean result = phoneValidator.validatePhone(phone);

        assertTrue(result);
    }

    @Test
    void phoneLengthCorrect_shouldPass() {
        String phone = "+37000000000";

        boolean result = phoneValidator.validatePhone(phone);

        assertTrue(result);
    }

    @Test
    void phoneLengthCorrect_shouldFail() {
        String phone = "+370";

        boolean result = phoneValidator.validatePhone(phone);

        assertTrue(result);
    }
}