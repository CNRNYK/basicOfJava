package days_tasks.part1.week_008.day_0024_arrays;

import java.util.Random;
import java.util.Scanner;

public class carsss {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int price = 0;
        String[] models = new String[7];
        models[0] = "Honda";
        models[1] = "Toyota";
        models[2] = "Nissan";
        models[3] = "BMW";
        models[4] = "Mercedes";
        models[5] = "Porsche";
        models[6] = "Ferrari";
        System.out.println("Input index number");
        int index =scn.nextInt();
        if (index < 3){
            price = rnd.nextInt((40000-20000)+1)+20000;
            System.out.println("Your car is " + models[index] + "price is " + price);
        }else if (index < 6){
            price = rnd.nextInt((80000-50000)+1)+50000;
            System.out.println("Your car is " + models[index] + "price is " + price);
        }else {
            price = rnd.nextInt((150000-100000)+1)+100000;
            System.out.println("Your car is " + models[index] + "price is " + price);
        }
    }
}
