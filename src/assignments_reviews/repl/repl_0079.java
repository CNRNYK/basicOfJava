package assignments_reviews.repl;
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */
import java.util.Scanner;

public class repl_0079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        for (int  i = 0 ; i<word.length(); i++){
            if (word.charAt(0)== 'x' ||word.charAt(0)== 'X'){
                word  = word.substring(1,word.length());
            }if(word.charAt(word.length()-1)== 'x'||word.charAt(word.length()-1)== 'X'){
                word  = word.substring(0,word.length()-1);
            }
        }


        System.out.println(word);
    }
}
