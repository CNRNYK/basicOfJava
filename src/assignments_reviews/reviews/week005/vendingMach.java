package assignments_reviews.reviews.week005;

import java.util.Scanner;

public class vendingMach {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Import your coin count");
        int coinCount = myScan.nextInt()*100;

        System.out.println("Enter count of vending items");
        int itemCount = myScan.nextInt()*5;

        calcul(coinCount , itemCount);

    }
    public static void calcul( int coinCount ,int itemCount){

        int cent,nickle,dime,quarter,payBack;

        payBack=coinCount-itemCount;

        if (payBack<0){
            System.out.println("You should pay much");
            return;
        }
        nickle=((payBack%25)%10)/5;
        dime=(payBack%25)/10;
        quarter=payBack/25;
        cent= payBack%10;

        System.out.println("Price in cent : "+coinCount);
        System.out.println("Your change is " + quarter + " quarters," + dime + " dimes, and " + nickle + " nickles " + cent + " cents");

    }

}
