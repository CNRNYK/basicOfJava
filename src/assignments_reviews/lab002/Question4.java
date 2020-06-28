package assignments_reviews.lab002;

//  Write a program that asks user for the number of males and the number of females registered in a class.
//  The program should display the percentage of males and females in the class.

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Question4_Females countsF = new Question4_Females();
        Question4_Males countsM = new Question4_Males();

        System.out.println("How many females are there");
        countsF.counter = myScan.nextInt();
        System.out.println("How many males are there");
        countsM.counter = myScan.nextInt();

        System.out.println("Percentage of fameles to males is : " +  (countsF.counter / countsM.counter)/(countsF.counter+ countsM.counter));
    }

}
