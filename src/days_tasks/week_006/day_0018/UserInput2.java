package days_tasks.week_006.day_0018;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Provide a sentece and i will repeat it : ");
        String repeat = myObj.next();


        System.out.println(repeat);
        System.out.println("---------------------");
        System.out.println("---------------------");
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Provide a sentece and i will repeat it : ");
        String repeat1 = myObj1.nextLine();

        System.out.println(repeat1);

    }
}
