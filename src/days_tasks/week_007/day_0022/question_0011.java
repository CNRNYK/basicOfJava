package days_tasks.week_007.day_0022;

import java.util.Scanner;

public class question_0011 {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = myScan.nextLine();
        System.out.println(countHi("Hi", text));

    }

    private static String countHi(String hi , String text) {
        int p = 0;

        for (int t = 0 ; t < text.length()-1 ; t++){

            if (text.substring(t,t+2).equals("hi")){
                p++;
            }
        }
        String str = "Your text contains: " + p;
        return str;
    }

}
