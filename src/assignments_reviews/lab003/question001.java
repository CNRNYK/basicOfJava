package assignments_reviews.lab003;

import java.util.Scanner;

public class question001 {
    // Create a method that accepts 1 string, e.g. "Bob", return a greeting of the form "Hello Bob!".
    //helloName("Bob") → "Hello Bob!" helloName("Alice") → "Hello Alice!" helloName("X") → "Hello X!"

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Please enter the name");
        System.out.println(helloName(myScanner.nextLine()));
    }

    public static String helloName(String pName){
        String hello = "Hello ";
        String  str = hello.concat(pName).concat("!");
        return str;
    }

}
