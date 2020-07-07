package days_tasks.week_007.day_0023_Random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc =  new Scanner(System.in);

        /*for (int x = 0 ; x<10 ; x++){
            System.out.println(rn.nextInt(100));
            System.out.println(rn.nextBoolean());
            System.out.println(rn.nextDouble());
            System.out.println(rn.nextLong());
            System.out.println("--------------");

        }

        */

        int num1 = rn.nextInt(100);
        int num2 = rn.nextInt(100);

        System.out.println("What is the following answer?: ");

        System.out.println(num1 + " + " + num2);

        int userAnswer = sc.nextInt();

        if ( num1+num2 == userAnswer){
            System.out.println("hacı brawo doğru correct answer");
        }else{
            System.out.println(" haci ne yaptın false");
        }



    }
}
