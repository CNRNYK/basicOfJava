package assignments_reviews.repl;
/*
input: abXYabc
input: 1
output: true
a appears twice

Example:
input: abXYabc
input: 2
output: true
ab appears twice

Example:
input: abXYabc
input: 3
output: false
abX appears once only
 */
import java.util.Scanner;

public class repl_0099 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        if(str.substring(n).contains(str.substring(0,n))){
            System.out.println(true);
            //System.out.println(str.substring(0,n)+" appears twice");
        }else {
            System.out.println(false);
        //System.out.println(str.substring(0,n)+" appears once only");
        }
    }
}