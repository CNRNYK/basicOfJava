package assignments.assignment_5;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args){
        //Write a program to calculate the sum of the numbers from 1 till upper bound.
        //If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
        //If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
        //If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
        //
        //You should use a while loop.

        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your upper bound");
        int  upperBound = myScan.nextInt();
        int startPoint = 0;
        int sum=0;
        int dash = 1;
        while (dash <= upperBound){

            sum  = sum + dash++;

        }
        System.out.println(sum);
    }
}
