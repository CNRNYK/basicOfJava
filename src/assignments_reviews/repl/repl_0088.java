package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0088 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int countOfCats = 0;
    int countOfDogs = 0;
    String word = scan.next();
    if((word.contains("cat") && word.contains("dog") )){
        // CAT SAYISI ILE DOG SAYISI ESIT
        //String str = "helloslkhellodjladfjhello";
        // String findStr = "hello";
        countOfCats += word.split("cat", -1).length-1;
        countOfCats += word.split("Cat" , -1).length-1;
        countOfDogs += word.split("dog", -1).length-1;
        countOfDogs += word.split("Dog" , -1).length-1;
//word.
        System.out.println(countOfCats);
        System.out.println(countOfDogs);
        if (countOfCats==countOfDogs){

        System.out.println(true);
        }
        else {
            System.out.println(false);}
    }

    }
}

