package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0097 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();


        int count = 0;
        for(int z = 0 ; z<word.length()-3;z++){
            if(word.charAt(z)=='j' && word.charAt(z+1  )==  'a' && word.charAt(z+2)=='v' && word.charAt(z+3)=='a'){
                count++;
            }
        }

        System.out.println(count);

    }
}