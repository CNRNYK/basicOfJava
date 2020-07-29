package assignments_reviews.repl;

import java.util.Scanner;

public class
repl_0096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();

        String gew= null;
        int count = scan.nextInt();
        for (int i =0 ; i<count ; i++){
            gew = word.concat(separator);
            gew = gew.concat(gew);
        }
        System.out.println(gew);




    }
}