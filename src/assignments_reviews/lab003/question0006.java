package assignments_reviews.lab003;

import java.util.Scanner;

public class question0006 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input your word");
        System.out.println(withoutEnd(myScanner.nextLine()));
    }

    private static String withoutEnd(String nextLine) {

        if(nextLine.length()>1){

            nextLine = nextLine.replace(nextLine, nextLine.substring(1,nextLine.length()-1));


        }else nextLine = "Your word is not in criteria";

        // comment


        return nextLine;
    }
}
