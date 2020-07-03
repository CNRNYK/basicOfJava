package days_tasks.week_007.day_0019_StringClasses;

import java.util.Scanner;

public class task78 {
    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter input");
        String str1 =  myObject.nextLine();
        int x = 0;
        for (int c =0 ; c < str1.length() ;c++){

            if ( 'a' == str1.charAt(c)){
                x = x +1;
            }

        }
        System.out.println("Number of a in this string is " + x);

    }
}
