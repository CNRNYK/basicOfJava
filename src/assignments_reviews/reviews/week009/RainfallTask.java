package assignments_reviews.reviews.week009;

import java.util.Scanner;

public class RainfallTask {
    public static void main(String[] args) {
        RainFall rainFall = new RainFall();
        Scanner keyboard = new Scanner(System.in);
        double[] rain = new double[12];
        String[] months = {"jan","feb","march","april","may","june","july","August","Sep","oct","nov","dec"};
        System.out.println("Please enter in the following rainfall for the months");
        System.out.println("month\tRainfall (In inches)");

        for(int i= 0 ; i<months.length ; i++){
            System.out.print(months[i] + " ");
            double val = keyboard.nextDouble();

            while(val<0){
                System.out.println("Do not enter a negative number. Re enter!");
                val = keyboard.nextDouble();
            }
            rain[i] = val;
        }
        System.out.println("Sum of the rain : " + rainFall.getSum(rain));
        System.out.println("Avarege of the rain : " + rainFall.getAverage(rain));
        System.out.println("max value of the rain :  " +rainFall.getMaxValue(rain));
        System.out.println("min value of the rain : " + rainFall.getMinValue(rain));
    }
}
