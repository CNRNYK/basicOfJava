package days_tasks.week_007.day_0023_Random;

import java.util.Random;
import java.util.Scanner;

public class task_0083 {

    public static void main(String[] args) {


        Scanner myScan = new Scanner(System.in);
        Random myRandom = new Random();

        System.out.println("Duygu Rolling the dice...");

        while (true){

            System.out.println("Their values are: " + (myRandom.nextInt(6) + 1) + " " + (myRandom.nextInt(6) + 1));
            System.out.println("hacııı Do you want to roll again Y or N");

            if ( myScan.nextLine().equalsIgnoreCase("y")){

                System.out.println("---------------------------");

            }else {
                System.out.println("Güle güleeeee");
                break;
            }
        }


    }
}
