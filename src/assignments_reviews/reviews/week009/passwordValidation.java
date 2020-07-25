package assignments_reviews.reviews.week009;

public class passwordValidation {
    public static void main(String[] args) {
        /*
        write can password vaild
        1- password have 6 char and do not contain space
        2- password at least 1 uppercase
        3- password should at least 1 lovercase
        4- special char
        5- a digit
         */
        String password = new String("23?A");
        System.out.println(passwordChecker(password));
    }

    private static boolean passwordChecker(String password) {
        boolean x = false;
        char[] c1 = new char[password.length()];
        for (int i =0;  i < password.length() ; i++){

        x = true;

//  ||  || )
            if (password.length()>=6 && Character.isDigit(c1[i]) && Character.isUpperCase(c1[i]) && Character.isLowerCase(i) && Character.isAlphabetic(c1[i])){


            }

        }

        return x;
    }
}
