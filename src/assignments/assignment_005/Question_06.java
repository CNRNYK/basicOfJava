package assignments.assignment_005;

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args){
        //Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5,             8, 13, 21, 34,......
        int levelOfFibonacci;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input level of Fibonacci");
        levelOfFibonacci = myObj.nextInt();

        int counter = 0;
        int value=1;
        int z=0;

        while (z++<=levelOfFibonacci){
            System.out.print(counter);
            int temp = counter;
            counter = value;
            value = value + temp;
            if(z  <= levelOfFibonacci)
                System.out.print(", ");
        }

        }



}
