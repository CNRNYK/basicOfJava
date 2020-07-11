package assignments_reviews.repl;
/*
In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

 */
import java.util.Scanner;

public class repl_0076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String name = "";
        String sName = "";

        if (email.contains("_")){
            name = email.substring(0,email.indexOf("_"));
            sName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            sName =  email.substring(email.indexOf("_")+1, email.indexOf("@")).concat("_").concat(email.substring(0,email.indexOf("_"))).concat(email.substring(email.indexOf("@"),email.length()));
            System.out.println(email.substring(email.indexOf("_")+1, email.indexOf("@")).concat("_").concat(email.substring(0,email.indexOf("_"))).concat(email.substring(email.indexOf("@"),email.length())));

        }else {
            System.out.println(email);
        }


    }}
















        /*        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String name = "";
        String sName = "";

        if (email.contains("_")){
            name = email.substring(0,email.indexOf("_"));
            sName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            sName =  sName + "_" +  name + email.substring(email.indexOf("@"),email.length());
            System.out.println(sName);

        }else {
            System.out.println(email);
        }


    }
}
*/