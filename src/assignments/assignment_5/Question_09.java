package assignments.assignment_5;

import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args){
        /*

        Write a program for the following logic:
Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.
         */


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter last value");
        int finalCount = myObj.nextInt();
        int counter = 1;
        while (counter <= finalCount){

            if (counter%2 == 1){
                System.out.print(counter);
                if (counter%2 == 1 && counter<(finalCount-1)){
                    System.out.print(", ");
                }
            }

        counter++;
        }

    }
}
