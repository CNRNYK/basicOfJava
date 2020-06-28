package assignments_reviews.lab002;

import java.util.Scanner;

// Write a program that asks the user for a positive nonzero integer value.
// The program should use a loop to get the sum of all the integers from 1 up to the number entered.

public class Question3 {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        boolean enough = true;
        int total = 0;

        while (enough){
            System.out.println("Please input positive number");
            int input = my.nextInt();
            if (input > 0) {
                total = total + input;
                System.out.println("Do you want continiue True or False");
                enough = my.nextBoolean();
            }
            else if( input< 0){
            System.out.println("You entered incorrect value");
            }
        }
        System.out.println("Total fo entered positive numbers are " + total);
    }
}
