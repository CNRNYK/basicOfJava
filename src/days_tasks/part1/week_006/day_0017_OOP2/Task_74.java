package days_tasks.part1.week_006.day_0017_OOP2;

import java.util.Scanner;

public class Task_74 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1 ; i>0; i++){

            System.out.println("Please enter a number");

            int a = myScan.nextInt();
            if(a < 0){
                break;
            }
            sum = sum + a;

        }
        System.out.println("-------------------------------");
        System.out.println("Sum of input numbers are "+ sum);


    }

}
