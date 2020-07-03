package days_tasks.week_007.day_0019_StringClasses;

import java.util.Scanner;

public class stringLenght {

    public static void main(String[] args) {

        String str1 = "Hello World";
        System.out.println(str1.length());

        System.out.println("---------------");

        int int1= str1.length();
        System.out.println(int1);

        System.out.println("----------------");

        String str2 = new String("Hello world");
        System.out.println(str2.length());

        System.out.println("----------------");
        Scanner scnt = new Scanner(System.in);
        System.out.println("What is your name and surname");
        String str3 =scnt.nextLine();

        System.out.println("What is your name and surname");
        String str4 =scnt.nextLine();
        System.out.println("Total character of your name and last name is: " + ( str3.length() + str4.length()));


    }
}
