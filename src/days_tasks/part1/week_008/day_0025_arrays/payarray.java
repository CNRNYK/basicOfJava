package days_tasks.part1.week_008.day_0025_arrays;

import java.util.Scanner;

public class payarray {
    public static void main(String[] args) {

        Scanner myTimeScan = new Scanner(System.in);
        final int employee = 5;

        int[] hours = new int[employee];
        int[] price = new int[employee];

        int[] pay = new int[employee];
        for (int i=0 ; i < employee ; i++){
            System.out.println("How much price do " + (i+1) + ". worker");
            price[i] = myTimeScan.nextInt();
            System.out.println("How many hours do "+ (i+1)   +". worker");
            hours[i] = myTimeScan.nextInt();
            pay[i] = price[i] * hours[i];
        }
        //System.out.println(Arrays.toString(pay));

        //  FOR EACH loop
        for (int val : pay){
            System.out.println(val);
        }

    }
}
