package assignments_reviews.repl;

import java.util.Scanner;

public class
repl_0096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        for(int i=0; i<count; i++){
            System.out.print(word);
            if(i<count-1){
                System.out.print(separator);
            }
        }



    }
}