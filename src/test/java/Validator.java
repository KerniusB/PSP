public class Validator {

    public static boolean validatePassword(String password, int length, String [] specSybol) {
        if(password.length()<length){
          return false;
        }
        if(password.equals(password.toUpperCase())){
            return false;
        }
        for (int i=0; i< specSybol.length; i++){
            if (!password.contains(specSybol[i])) {
                return false;
            }
        }

        return false;
    }

    public static boolean validatePhone(String phone) {

        return true;
    }

    public static boolean validateEmail(String email) {

        return true;
    }
}
