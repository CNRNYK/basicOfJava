package assignments_reviews.lab003;

import java.util.Scanner;

public class question08 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your word");
        System.out.println(left2(myScan.nextLine()));
    }

    private static String left2(String nextLine) {
        if (nextLine.length()>1){

            nextLine = nextLine.substring(2,nextLine.length()) + nextLine.substring(0,2);

        }else {
            nextLine = "Your input is 1 char";
        }



        return nextLine;
    }
}
