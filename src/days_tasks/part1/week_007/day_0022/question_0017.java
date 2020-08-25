package days_tasks.part1.week_007.day_0022;

import java.util.Scanner;

public class question_0017 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your input");
        System.out.println(palindrome(myScanner.nextLine()));
    }

    private static boolean palindrome(String nextLine) {
        String dummy = "";
        boolean bool= false;
        for (int x = nextLine.length()-1 ; x >= 0 ; x-- ){

            dummy = dummy + nextLine.charAt(x);

        }
        if (nextLine.replace(" ","").equalsIgnoreCase(dummy.replace(" ",""))){
            bool = true;
        }

        System.out.println("--------------------" +
                "");
        System.out.println(nextLine.replace(" ",""));
        System.out.println("--------------------");
        System.out.println(dummy.replace(" ",""));
        System.out.println("--------------------");

        return bool;

    }

}
