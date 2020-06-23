package assignments_reviews.reviews.week005;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please input bedroom count");
        int room = myScan.nextInt();
        

        System.out.println("Starting price is " + (numberOfBadroom(room) - calculateInv(room)));
    }
    public static  int numberOfBadroom(int room){
        int price = 0;
        if (room ==1 ){
            price =1100;
        }
        if (room ==2 ){
            price =1850;
        }
        if (room ==3 ){
            price =2550;
        }
        return price;
    }
    public static double calculateInv(int room){

       return numberOfBadroom(room)*0.5;

    }

}
