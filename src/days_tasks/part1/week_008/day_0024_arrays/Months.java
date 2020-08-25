package days_tasks.part1.week_008.day_0024_arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int x = mysc.nextInt();
        System.out.println("ınput");

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

        System.out.println("Mounth is " + months[x]);
    }

}
