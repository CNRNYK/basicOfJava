package assignments_reviews.lab003;

import java.util.Scanner;

public class question0010 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your word");

        System.out.println(frontAgain(myScan.nextLine()));


    }

    private static boolean frontAgain(String fullWord ) {
        String twoChar = fullWord.substring(0,2);
        boolean bool;

        if (fullWord.substring(1,fullWord.length()).contains(twoChar)){
            bool = true;

        }else  {
            bool = false;
        }


        return bool;
    }
}
