package assignments_reviews.reviews.week003;

import java.util.Scanner;

public class inClass {
    public static void main(String[] args){
       Scanner newScan = new Scanner(System.in);
       System.out.println("Begin range");

       int begin = newScan.nextInt();
        System.out.println("End Number");
       int end = newScan.nextInt();
        System.out.println("Even for 1, Odd for 0");
       int prefer = newScan.nextInt();

       int odd = 0;
       int even = 0;

       for (int i = begin ; i<= end; i++){
           if (i%3==0){
                System.out.print(i +" ");
               if (prefer == 0){
                   odd = odd +i%2;
               }
               else {
                   even = even +i;
               }
            }


    } System.out.println("Even numbers "+even);
        System.out.println("Odd numbers "+odd);}

}
