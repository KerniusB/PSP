import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {
    EmailValidator emailValidator = new EmailValidator();

    @Test
    void emailContainsAtSign_shouldPass() {
        String email = "email@mail.com";

        boolean result = emailValidator.validateEmail(email);

        assertTrue(result);
    }

    @Test
    void emailContainsAtSign_shouldFail() {
        String email = "emailmail.com";

        boolean result = emailValidator.validateEmail(email);

        assertFalse(result);
    }

    @Test
    void emailDoesNotContainInvalidSymbols_shouldPass() {
        String email = "email@mail.com";

        boolean result = emailValidator.validateEmail(email);

        assertTrue(result);
    }

    @Test
    void emailDoesNotContainInvalidSymbols_shouldFail() {
        String email = "email@ mail.com";

        boolean result = emailValidator.validateEmail(email);

        assertFalse(result);
    }

    @Test
    void emailHasCorrectDomain_shouldPass() {
        String email = "email@mail.com";

        boolean result = emailValidator.validateEmail(email);

        assertTrue(result);
    }

    @Test
    void emailHasCorrectDomain_shouldFail() {
        String email = "email@wrong domain.com";

        boolean result = emailValidator.validateEmail(email);

        assertFalse(result);
    }

    @Test
    void emailHasCorrectTld_ShouldPass() {
        String email = "email@mail.com";

        boolean result = emailValidator.validateEmail(email);

        assertTrue(result);
    }

    @Test
    void emailHasCorrectTld_ShouldFail() {
        String email = "email@mail.com wrong";

        boolean result = emailValidator.validateEmail(email);

        assertFalse(result);
    }
}