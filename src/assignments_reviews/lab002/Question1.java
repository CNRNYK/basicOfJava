package assignments_reviews.lab002;

import java.util.Scanner;

public class Question1 {
    /*
    Question-1

    Write a program with a loop that lets the user enter a series of integer numbers.
    After all the numbers have been entered, the program should display the largest and smallest numbers entered.

     */

    public static void main(String[] args) {

        int largest , smallest;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your first number");
        smallest = largest = myObj.nextInt();

        do {
            System.out.println("next number");
            int temp = myObj.nextInt();
            smallest = (temp < smallest) ? temp : smallest;
            largest = (temp > largest) ? temp: largest;
            System.out.println("For exit type 0 , For continiue type 1");
            if ( myObj.nextInt() == 0) break;
        }while (true);
        System.out.println("--------------------------------------------------");
        System.out.println("Smallest number is  :" + smallest);
        System.out.println("Largest number is   :"  + largest);
        /*for (int x = 1 ; x>0  ;x++){

            if (input == 1){

                System.out.println("Enter your next number");
                min  = myObj.nextInt();
                if(min > largest){
                    min =  largest+ min;
                    largest  = min - largest;
                    min  = min - largest;
                }
            }

            if (input == 0){
                System.out.println("Smallest number is  :" + min);
                System.out.println("Largest number is   :"  + largest);
                break;
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Do  you  want enter another number? 0 = NO ; 1 = YES");
            Scanner endProcess = new Scanner(System.in);
            input = endProcess.nextInt();
        }*/

    }

}
