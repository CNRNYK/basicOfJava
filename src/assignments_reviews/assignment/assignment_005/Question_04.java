package assignments_reviews.assignment.assignment_005;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args){

        /*Write a while loop that lets the user enter a number.
        The number should be multiplied by 10, and the result stored in the variable product.
        The loop should iterate as long as product contains a value less than 100.
         */

        int number = 1;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please input your number");
        number = myObj.nextInt() * 10 ;

        while (number>100){

            System.out.println("Your stored value is " + number);
            number++;

        }


    }
}
