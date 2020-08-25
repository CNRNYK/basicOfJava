package days_tasks.part1.week_006.day_0018;

import java.util.Scanner;

public class UserInput3 {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int num1 = my.nextInt();

        int num2 = my.nextInt();

        my.nextLine();
        String str = my.nextLine();

        System.out.println(num1 + " : " + num2 + " : " + str);
    }
}
