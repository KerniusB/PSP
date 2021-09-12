import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TempTest {

    @Test
    void passwordChecker() {
        assertTrue(Validator.validatePassword("Slaptazodis", 10, new String[]{"a"}));
    }

    @Test
    void phoneValidator() {
        String phone="+370121212";
        assertTrue(Validator.validatePhone(phone));
    }

    @Test
    void emailValidator() {
        String email="testas@testas.com";
        assertTrue(Validator.validateEmail(email));
    }
}