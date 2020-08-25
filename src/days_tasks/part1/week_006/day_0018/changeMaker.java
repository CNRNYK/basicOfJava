package days_tasks.part1.week_006.day_0018;

import java.util.Scanner;

public class changeMaker {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);



        for (int i = 1 ; i < 4; i++ ){
            System.out.println("Please input your money in hand");
            int inputs = myObj.nextInt();
            if (inputs<100 && inputs>1){
                change(inputs);
                break;
            }
            System.out.println("Invalid data");
            if (i==3){

                System.out.println("Sorry no more attemp");
            }
            System.out.println("-------------------");

        }


    }

    public static void change(int amount){
        int quarters = amount/25;
        int dimes = (amount - (quarters*25)) /10;   // parantez içindeki işlem aslında    input = input%25
        int nickels = (amount - ((dimes*10) + (quarters*25)))/5;
        int pennies = (amount -((dimes*10) + (quarters*25) + (nickels*5)));

        System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);

    }

}

