package days_tasks.week_007.day_0019_StringClasses;

import java.util.Scanner;

public class task79 {
    public static void main(String[] args) {
        Scanner myO = new Scanner(System.in);
        String str1 = myO.nextLine();
        String str2;

        for (int x = 0 ; x < str1.length() ; x++ ){

            char letter = str1.charAt(x);
            if ( letter == 'a' ||letter == 'e' ||letter == 'i' ||letter == 'o'){

                System.out.print(letter + ",");
            }

        }



    }
}
