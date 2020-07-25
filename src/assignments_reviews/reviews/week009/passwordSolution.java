package assignments_reviews.reviews.week009;

public class passwordSolution {

    public static void main(String[] args) {

		/*
		 Write a return method that can verify if a password is valid or not
		 Requirements:
		 1-Password MUST be at least have 6 characters and should not contain space
		 2-Password should at least contain one upper case letter
		 3-Password should at least contain one lowercase letter
		 4-Password should at least contain one special character
		 5-Password should at least contain a digit
		 If All requirements above met, the method returns true, otherwise returns false
		 */

        System.out.println(validatePassword("Apple@compu5ter"));

    }


    public static String validatePassword(String str) {



        //apple xxxx
        boolean lenght = false;
        boolean space = true;
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;


        if(str.length()>=6) {
            lenght=true;
        }

        for(int i=0;i<str.length();i++) {
            if(Character.isSpaceChar(str.charAt(i))) {
                space = false;
                break;
            }
        }

        for(int i=0;i<str.length();i++) {
            if(Character.isLowerCase(str.charAt(i))) {
                lower = true;
                break;
            }
        }

        for(int i=0;i<str.length();i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                upper= true;
                break;
            }
        }

        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(str.charAt(i))) {
                digit=true;
                break;
            }
        }

        //special character - >
        for(int i=0;i<str.length();i++) {
            if(!Character.isLetterOrDigit(str.charAt(i)) && !Character.isSpaceChar(str.charAt(i))) {
                special=true;
                break;
            }
        }

        if(lenght && space && lower && upper && digit && special) {
            return "valid";
        }else {
            return "not valid";
        }








    }



}