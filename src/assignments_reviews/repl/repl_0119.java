package assignments_reviews.repl;

import java.util.Scanner;

/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */
public class repl_0119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        if (!email.contains("@")){
            System.out.println("invalid email");
        }else if(email.indexOf("@")<email.indexOf("@",email.indexOf("@")+1)){
            System.out.println("invalid email");
        }else{
            int indexAt  = email.indexOf("@");
            System.out.println("Email id: "+ email.substring(0,indexAt));
            System.out.println("Email domain: "+ email.substring(indexAt+1));
        }
    }
}