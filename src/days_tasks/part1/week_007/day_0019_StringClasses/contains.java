package days_tasks.part1.week_007.day_0019_StringClasses;

import java.util.Scanner;

public class contains {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        String email = myScan.nextLine();
        if (!email.contains("gmail")){
            System.out.println("This is google account");
        }
        else System.out.println("This is other account");
    }
}
