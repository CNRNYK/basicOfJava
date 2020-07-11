package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String name = email.substring(0,1).toUpperCase().concat(email.substring(1,email.indexOf("_")));
        String sName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase().concat(email.substring(email.indexOf("_")+2, email.indexOf("@")));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String tLevel = email.substring(email.indexOf(".")+1,email.length());

        System.out.println("First name: "+name);
        System.out.println("Last name: "+sName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+ tLevel);




    }
}



