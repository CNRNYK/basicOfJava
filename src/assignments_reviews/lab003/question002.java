package assignments_reviews.lab003;
// Create a method that accepts two strings, a and b,
// return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

import java.util.Scanner;

public class question002 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first input");
        String f = myScanner.nextLine();

        System.out.println("Enter second input");
        String s = myScanner.nextLine();
        System.out.println(makeAbba(f,s));

    }

    public static String makeAbba(String first, String second){


        String abba  = first.concat(second).concat(second).concat(first);
        return abba;
    }
}
