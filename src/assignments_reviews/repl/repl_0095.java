package assignments_reviews.repl;

import java.util.Scanner;
/*
The ASCII value of lowercase alphabets are from 97 to 122.

And, the ASCII value of uppercase alphabets are from 65 to 90.

That is, alphabet a is stored as 97 and alphabet z is stored as 122.

Similarly, alphabet A is stored as 65 and alphabet Z is stored as 90.
 */

public class repl_0095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        final int o = end-start;
        String value="";
        if (start>=65&&end<=90){
            for (int i =0;  i<o+1  ;i++){
                value  += start++;
            }
        }else if (start>=97&&end<=122){
            for (int i =0;  i<o+1  ;i++){
                value  += start++;
            }
        }
        System.out.println(value);
        System.out.println(value.length());

    }
}