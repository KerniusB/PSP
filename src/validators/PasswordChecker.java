package validators;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PasswordChecker {
    String specSymbols;

    public PasswordChecker() throws IOException {
        FileInputStream fis = new FileInputStream("resources/config.properties");
        Properties prop = new Properties();
        prop.load(fis);

        this.specSymbols = prop.getProperty("specSymbols");
    }

    public boolean checkLength(String password, int minLength) {
        return password.length() >= minLength;
    }

    public boolean checkUppercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSpecialSymbols(String password) {
        for (int i = 0; i < specSymbols.length(); i++) {
            for (int j = 0; j < password.length(); j++) {
                if (password.charAt(j) == specSymbols.charAt(i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
