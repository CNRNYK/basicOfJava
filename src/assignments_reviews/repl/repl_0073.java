package assignments_reviews.repl;

import java.util.Scanner;
/*
Instructions from your teacher:
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */
public class repl_0073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        if (word.length()>=5 && word.length()%2==1){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }else {
            System.out.println("invalid");
        }



    }
}
