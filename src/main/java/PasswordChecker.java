public class PasswordChecker {

    public boolean validatePassword(String password) {
        int minLength = 7;
        char[] invalidSymbols = {'@'};

        return passwordNotShorterThan(password, minLength) && passwordContainsUppercase(password) && passwordContainsSpecSymbol(password, invalidSymbols);
    }

    private boolean passwordNotShorterThan(String password, int minLength) {
        return false;
    }

    private boolean passwordContainsUppercase(String password) {
        return false;
    }

    private boolean passwordContainsSpecSymbol(String password, char[] invalidSymbols) {
        return false;
    }
}
