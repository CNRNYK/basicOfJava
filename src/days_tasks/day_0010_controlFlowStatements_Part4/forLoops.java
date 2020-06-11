package days_tasks.day_0010_controlFlowStatements_Part4;

import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {

        int x=0;
        if (x++ <= 15){
            System.out.println("Hello");
            } else{
            System.out.println("Bye");}

        // for ( init; condition ; increement ){ .... }
       /*

       Task 40
       Write a program that displays all even numbers between 1-100 in same line

        */
        int a = 0;
        for ( int b = 0; b<10 ; b++ ) // For döngüsü içersinde kullandığın ve tanımladığın init sadece for döngüsü için geçerli
            {
            System.out.print( b +" Caner ");
            if (a++ <=0){
                System.out.println("Print it once");
            }
        }

        System.out.println("\n");

        /*

        Task-42
        Çift numaraları yazdıran

         */
        System.out.println("Write even numbers");

        for ( int b = 0 ; b <= 100 ; b+=2){  // Wrong approach about "0" variable
            System.out.print(b + " ");
        }

        System.out.println("\n");

        System.out.println("Write even numbers");
        for (int b=1; b<=101 ;b++) {
            if (b%2 == 0){
            System.out.print(b +" ");
        }
        }
        System.out.println("\n");

        /*
        All odd numbers between 5 - 140
        Write a program that displays all odd numbers between 5-140 in same line
         */
        System.out.println("All odd numbers between 5 - 140");
        for ( int z = 4 ; z <= 140 ; z++ ){

            if ( z%2 == 1 ) {
                System.out.print(z + " ");
            }
        }

        for(int i=5; i<=140 && i%2==1;i+=2) {
            System.out.print(i+" ");
        }

        System.out.println("\n");

        /*
        Sum Even and Ods
         */

        System.out.println("Sum Even and Ods");
        int SumEven = 0;

        for (int b=1; b<=100 ;b++) {
            if (b%2 == 0){
                SumEven = b + SumEven;
            }
        }
        System.out.println("Sum even numbers : " + SumEven);

        int SumOddNumbers = 0;
        for ( int z = 0 ; z <= 100 ; z++ ){

            if ( z%2 == 1 ) {
                SumOddNumbers += z;
            }
        }
        System.out.println("Sum odd numbers : "  + SumOddNumbers);

        /*

        Karesini alan program

         */

        int number, square;
        System.out.println("Number           NumberSquared");
        System.out.println("------------------------------");
        for (int i = 0 ; i <= 10 ; i++){
            System.out.println(i + "\t\t" + (i*i));
        }
        System.out.println("\n");

        /*


        TASK 44

        KPH to MPH

         */

        Scanner object = new Scanner(System.in);

        int kph;
        double mph;
        for (int z = 60 ; z <= 130 ; z+=10){
            System.out.println(z + "\t\t" + (z*0.6214));
        }
        /*
        Another aporach for  Task 44
         */
        final int StartigKPH = 60;
        final int MaxKPH = 130;
        final int increasment = 10;
        System.out.println("KPH\t\tMPH");
        System.out.println("------------------------");
        for (kph = StartigKPH ; kph <=MaxKPH ; kph+=increasment){
            mph = kph * 0.6214;
            System.out.println(kph+"\t\t"+mph);
        }

        /*

        Task - 45

         */
        System.out.println("Write times ");
        final int times = object.nextInt();
        int k = 10;
        int l = 11;
        for (int i=1 ; i <= times ; i++ ){
            if (k>l){
                System.out.println("K greater then L");
            }else if (k<l){
                System.out.println(i + " L is Greater then K");
            }else System.out.println("They are equals");
        }

        /*

        Task - 46

         */

        System.out.println("Multiplication for = ");
        int Number = object.nextInt();

        for (int f = 0 ; f <= 10 ; f++){

            System.out.println(Number + "*" + f + "=" + (Number*f) ) ;
        }
    }
}
