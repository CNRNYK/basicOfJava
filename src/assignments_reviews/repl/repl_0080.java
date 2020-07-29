package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input your start");
        String start = scan.nextLine();
        System.out.println("input your end");
        String end = scan.nextLine();

        String route = "ABCD";
        int current = route.indexOf(start.toUpperCase());   //0
        int last = route.indexOf(end.toUpperCase());        //3

        if (current==last) {
            System.out.println(end + " found");
        }
        while(current!=last) {
            if(route.charAt(current)=='A') System.out.print("right");   //charAt fonksiyonu kontrol
            if(route.charAt(current)=='B') System.out.print("down");
            if(route.charAt(current)=='C') System.out.print("left");
            if(route.charAt(current)=='D') System.out.print("up");
            current++;
            current = current %4;
            if(current==last) {
                System.out.println(": "+ end + " found");
                break;
            }
            System.out.print(" > ");
        }
    }
}