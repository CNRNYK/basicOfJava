package assignments_reviews.lab002;

// Write a program that will ask the user to enter the amount of a purchase.
// The program should then compute the state and county tax sales tax.
// Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
// The program should display the amount of the purchase , the state sales tax, the county sales tax, the total sales tax, and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner myScanner  = new Scanner(System.in);
        System.out.println("Please enter the amount of a purchase");
        int amount  = myScanner.nextInt();
        System.out.println("Please enter price of your purchase");
        double  price = myScanner.nextDouble();
        double  totalPrice = price*amount;

        double salesTax  = totalPrice *  0.04;
        double countryTax =   totalPrice * 0.02;

        System.out.println("You payed:" + totalPrice  +  "  sales  tax:  " + salesTax  + " country tax is: " + countryTax);


    }




}
