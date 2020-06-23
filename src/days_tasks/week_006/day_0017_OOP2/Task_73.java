package days_tasks.week_006.day_0017_OOP2;

import java.util.Scanner;

public class Task_73 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int secretNumber = 48;

        for (int x = 1 ; x>0 ; x++  ){
            System.out.println("Guess a number");
            int inputNumber = myScan.nextInt();
        if (secretNumber > inputNumber){
            System.out.println("You should increase your guess");
            System.out.println("------------------------------\n");
        }else if (secretNumber < inputNumber){
            System.out.println("You should decrease your guess");
            System.out.println("------------------------------\n");
        }else if (secretNumber==inputNumber){
            System.out.println("\nCongrats you find the number" + secretNumber);
            break;
        }

        }
        System.out.println("Outed to loop");
    }
}
