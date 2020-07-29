package assignments_reviews.repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_0088 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int countOfCats = 0;
    int countOfDogs = 0;
    String word = scan.next();
    while (word.contains("cat") || word.contains("dog")) {
        if(word.contains("cat")) {
            countOfCats++;
            int i= word.indexOf("cat");
            word=word.substring(0, i).concat(word.substring(i+3));

        }
        if(word.contains("dog")) {
            countOfDogs++;
            int i= word.indexOf("dog");
            word=word.substring(0, i).concat(word.substring(i+3));
        }

    }

    if(countOfCats==countOfDogs) System.out.println(true); else System.out.println(false);

    }
}