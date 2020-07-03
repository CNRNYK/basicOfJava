package assignments_reviews.lab003;

//Create a method return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//extraEnd("Hello") → "lololo" extraEnd("ab") → "ababab" extraEnd("Hi") → "HiHiHi"

import java.util.Scanner;

public class question003 {
    public static void main(String[] args) {
        Scanner myScanner  = new Scanner(System.in);
        System.out.println("Input your string :");
        String input =  myScanner.nextLine();
        System.out.println(extraEnd(input));
    }

    public static String extraEnd(String pInput){
        String str;
        int length = pInput.length();
        if (length < 2) {
            str =  " Your input is 1 character";
        }else {
            str  = pInput.substring(length-2, length);
            str = str.concat(str).concat(str);
        }

        return str;
    }

}
