package assignments_reviews.lab002;

// Write a program that computes the tax and tip on a restaurant bill.
// The program should ask the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
// The tip should be 20 percent of the total after adding tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter charge  of meal: ");
        double charge = myScanner.nextDouble();
        double tax = charge * 0.0675;
        double tip = charge * 0.2;

        System.out.println("Total price is : "  + (charge + tip) + " tip is  : "  + tip + " tax is : " + tax );



    }


}
