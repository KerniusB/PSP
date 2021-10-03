package validators;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneValidator {
    List<String> phoneInfo = new ArrayList<>();
    int length;
    String prefix;

    public PhoneValidator() throws FileNotFoundException {
        File myObj = new File("resources/prefixLength.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            phoneInfo.add(data);
        }
        myReader.close();
    }

    public boolean checkSymbols(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public String changePrefix(String s, String s1) {
        if (s1.charAt(0) == '8') {
            return s + s1.substring(1);
        }
        return null;
    }

    public boolean validateNumberByCountry(String country, String num) {
        for (int i = 0; i < phoneInfo.size(); i++) {
            if (phoneInfo.get(i).split(" ")[0].equals(country)) {
                length = Integer.parseInt(phoneInfo.get(i).split(" ")[1]);
                prefix = phoneInfo.get(i).split(" ")[2];
            }
        }
        for (int j = 0; j < prefix.length(); j++) {
            if (prefix.charAt(j) != num.charAt(j)) {
                return false;
            }
        }
        return num.length() == length;
    }
}
