package assignments_reviews.reviews.week005;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("What is your height with meter");
        double height = myScan.nextDouble();

        System.out.println("What is your weight");
        double weight = myScan.nextDouble();

        System.out.println("You are " + bmi(height , weight));
    }
    public static String bmi(double height, double weight){
        double bmi = weight/ (height*height);
        String test;

        if (bmi<18.5){
            test ="Underweight";
        }
        else if ( bmi < 25){
            test = "Normal weight";
        }
        else if (bmi < 30){
            test = "Too weight" ;       }
        else test = "Obez";

        return test;
    }
}
