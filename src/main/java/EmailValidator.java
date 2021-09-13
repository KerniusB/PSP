public class EmailValidator {

    public boolean validateEmail(String email) {
        return emailContainsAtSign(email) && emailDoesNotContainInvalidSymbols(email) && emailHasCorrectDomain(email) && emailHasCorrectTld(email);
    }

    private boolean emailContainsAtSign(String emaill) {
        return false;
    }

    private boolean emailDoesNotContainInvalidSymbols(String email) {
        return false;
    }

    private boolean emailHasCorrectDomain(String email) {
        return false;
    }

    private boolean emailHasCorrectTld(String email) {
        return false;
    }
}
