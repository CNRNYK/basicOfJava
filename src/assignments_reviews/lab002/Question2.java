package assignments_reviews.lab002;
//A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 serving in the bag and that a serving equals 300 calories.
// write a program that lets the user enter the number of cookies he or she actually ate and then reports the number of total calories consumed.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int cookies = 1;
        int bag = cookies*40;
        int calories =  cookies*30;
        Scanner myScan = new Scanner(System.in);
        int eat = myScan.nextInt();
        int eatedCalories = calories* eat;
        System.out.println("You eat tottally " + eatedCalories);

        System.out.println("--------------");
        // TODO Auto-generated method stub
        int oneBag = 40;
        int servePerBag = 10;
        int caloriPerServe = 300;
        int cookiePerServe = oneBag / servePerBag;
        double caloriPerCookie = caloriPerServe / cookiePerServe;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many cookie do you eat ?");

        System.out.println("You take " + sc.nextInt() * caloriPerCookie + " calories");


    }
}
