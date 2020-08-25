package days_tasks.part1.week_008.day_0025_arrays;

import java.util.Scanner;

public class TaskRainfall {
    public static void main(String[] args) {
        Scanner  my = new Scanner(System.in);
        String[] months = new String[12];
        months[0] = "Jan";
        months[1] = "Fab";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "Des";
        int[] rainfall = new int[12];
        System.out.println("Input months rainfall values");
        for (int z=0 ; z<rainfall.length;  z++){
            System.out.print(months[z] + ": ");
            rainfall[z] = my.nextInt();

        }
        System.out.println("Sum of  total rain : " + getTotal(rainfall));
        System.out.println("Avarege montly : " + aveMonthly(rainfall));
        System.out.println("Most rain : " + mostRain(rainfall));
        System.out.println("Min total rain : " + minRain(rainfall));

    }

    private static int getTotal(int[] rainfalls) {
        int total = 0;
        for (int value :  rainfalls){

            total += value;
        }
        return total;
    }

    private static int aveMonthly(int[] rainfall) {
        int avarege = 0;
        for (int value :  rainfall){

            avarege += value;
        }
        avarege = avarege/rainfall.length;

        return avarege;
    }

    private static int minRain(int[] rainfall) {
        int min = 0;
        int temp = 0;

        for (int i = 0; i < rainfall.length-1; i++) {

            temp = rainfall[i];

            if (temp <= rainfall[i+1]){
                rainfall[i+1] = temp;
                min = rainfall[i+1];
            }else  {
                min  = rainfall[i+1];
            }
        }

        return min;
    }

    private static int mostRain(int[] rainfall) {
        int max = 0;
        int temp = 0;

        for (int i = 0; i < rainfall.length-1; i++) {

            temp = rainfall[i];

            if (temp >= rainfall[i+1]){
                rainfall[i+1] = temp;
                max = rainfall[i+1];
            }else  {
                max  = rainfall[i+1];
            }
        }

        return max;
    }
}
