package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0093 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length()<4){
            exists = false;
        }else if (word.substring(0,4).contains("java")||word.substring(1,5).contains("java")){ //word.charAt(0)=='j'||word.charAt(1)=='j')
            //word.substring(0,4).contains("java")
            exists = true;
        }
        System.out.println(exists);
    }
}