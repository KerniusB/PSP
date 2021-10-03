package validators;

public class EmailValidator {
    String symbols = "/ ";

    public boolean checkAtSign(String email) {
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                return true;
            }
        }
        return false;
    }

    public boolean checkSymbols(String email) {
        for (int i = 0; i < symbols.length(); i++) {
            for (int j = 0; j < email.length(); j++) {
                if (email.charAt(j) == symbols.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkDomainAndTLD(String email) {
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                return checkDomain(email.substring(i + 1));
            }
        }
        return false;
    }

    private boolean checkDomain(String email) {
        int length = 0;

        for (int i = 0; i < email.length(); i++) {
            length++;
            if (!(Character.isDigit(email.charAt(i)) || Character.isAlphabetic(email.charAt(i))
                    || email.charAt(i) == '-' || email.charAt(i) == '.')) {
                return false;
            }
        }
        if (length <= 0 || length > 253) {
            return false;
        }
        for (int i = 1; i < email.length() - 1; i++) {
            if (email.charAt(i) == '.') {
                return true;
            }

        }
        return false;
    }
}
