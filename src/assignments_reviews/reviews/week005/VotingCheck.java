package assignments_reviews.reviews.week005;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
    Scanner my = new Scanner(System.in);
        System.out.println("Enter birrthyear");
        int birt = my.nextInt();
        if (check(birt)){
            System.out.println("You are eligible");
        }else System.out.println("You are not eligible");
    }
    public static boolean check(int birrthyear){
        boolean checked;
        if (2020 - birrthyear >= 18){
           checked = true;
        }else {checked = false;}

        return checked;

    }


}
