package assignments_reviews.repl;


import java.util.Scanner;

public class repl_0069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String temp="";
        temp =  word.substring(0,word.length()/2-1).concat(word.substring(0,word.length()/2));
        System.out.println(temp);
    }
}
