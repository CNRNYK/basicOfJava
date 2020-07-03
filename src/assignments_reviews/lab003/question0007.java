package assignments_reviews.lab003;

import java.util.Scanner;

public class question0007 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your first line");
        String first = myScan.nextLine();
        System.out.println("Input your second line");
        String second = myScan.nextLine();
        System.out.println(comboString(first,second));
    }

    private static String comboString(String first, String second) {
        String str = null;

        if (first.length()>second.length()){
            str = second.concat(first).concat(second);
        }else if (first.length()<second.length()){
            str = first.concat(second).concat(first);
        }else{
            str = "That has same char length";
        }


        return str;
    }
}
