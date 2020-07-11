package assignments_reviews.repl;
/*
Write a program that will print out route instructions.
Your program should take 2 parameters: start point and endpoint.
Use left, right, up and down for navigation. Insert ">" between commands.
If start point equals to endpoint - display: "start/end(start or end variable!) found".
Note: you may move only clockwise.

 */
import java.util.Scanner;

public class repl_0080 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String start = scan.next();
    String end = scan.next();
    String text = "A right B down C left D up A right B down C left ";
    String right = "right";
    String down= "down";
    String left = "left";
    String up = "up";
    String output  =  "";

    for(int i = 0 ; i < 100 ; i++){
        if(start.equals(end)){
            System.out.println(start +" found");
            break;
        }else{
            output = text.substring(text.indexOf(start),text.indexOf(end));
            System.out.println(output);
            break;
        }
    }


}
}