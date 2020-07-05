package assignments_reviews.lab003;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner  mys = new Scanner(System.in);
        String a =  mys.nextLine();
        String b =  mys.nextLine();

        System.out.println( makeAbba(a, b)   );

    }

    public static String makeAbba(String pA, String pB) {


        String  str = pA.concat(pB).concat(pB).concat(pA);


        return str;
    }

}
