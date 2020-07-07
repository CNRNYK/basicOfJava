package days_tasks.week_007.day_0022;

import java.util.Scanner;

public class question_0012 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your entry ");
        String first = myScan.nextLine();
        String cat = "cat";
        String dog = "dog";
        System.out.println(catDog(first, cat, dog));
    }

    private static boolean catDog(String first, String cat, String dog) {
        boolean c =false ,d =false;

        if (first.contains(cat)){
            c = true;
        }
        if (first.contains(dog)) {

            d = true;
        }
        if (d&&c){
            return true;
        }else {
            return false;
        }


    }
}
