package days_tasks.part1.week_007.day_0022;

import java.util.Scanner;

public class question_0015 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter");
        String text = myScan.nextLine();
        System.out.println(hasBad("bad" , text));
    }

    private static boolean hasBad(String bad, String text) {

        boolean p = false;



        for ( int x = 0 ; x < 2 ; x++){
            if (text.length()<3){
                return p;
            }
            if (text.substring(x, x+3).equals(bad)){
                p = true;
                break;
            }else {
                p = false;}
        }

        return p;
    }
}
