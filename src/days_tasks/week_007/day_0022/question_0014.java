package days_tasks.week_007.day_0022;

import java.util.Scanner;

public class question_0014 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your entry");
        System.out.println(endsLy("Ly", myScan.nextLine()));
    }

    private static boolean endsLy(String ly, String nextLine) {

        if (nextLine.contains(ly)){
            return true;
        }
        return false;
    }
}
