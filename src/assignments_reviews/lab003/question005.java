package assignments_reviews.lab003;

import java.util.Scanner;

public class question005 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your word");
        System.out.println(firstHalf(myScan.nextLine()));
    }

    private static String firstHalf(String nextLine) {

        nextLine = nextLine.substring(0,nextLine.length()/2);


        return nextLine;
    }
}
