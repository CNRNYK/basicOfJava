package assignments_reviews.reviews.week005;

import java.util.Scanner;

public class add {  public static void main(String[] args) {

    plus();
}

    public static void plus(){


        //your code here

        Scanner myScan = new Scanner(System.in);

        System.out.println("enter first number:");
        int first = myScan.nextInt();


        System.out.println("enter second number:");
        int second = myScan.nextInt();

        int result = first + second;
        System.out.println("result: " + result);
    }

}