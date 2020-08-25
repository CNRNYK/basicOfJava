package days_tasks.part1.week_007.day_0022;

import java.util.Scanner;

public class question_0013 {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        String text = myScan.nextLine();
        System.out.println(doubleChar(text));


    }

    private static String doubleChar(String text) {
        String str = "";

        for ( int m = 0 ; m <=  text.length() ; m++ ){

            str = str + text.substring(m,m+1).concat(text.substring(m,m+1));

        }


        return str;
    }


}
