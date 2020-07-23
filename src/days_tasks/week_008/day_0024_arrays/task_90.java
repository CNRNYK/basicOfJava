package days_tasks.week_008.day_0024_arrays;

import java.util.Random;

/*
Create an array with 10 elements
Initialize each array element with random values between 0 and 100 but less than 100
Print each array element
 */
public class task_90 {
    public static void main(String[] args) {
        Random rnd1 = new Random();
        int[] rnd = new int[10];
        for (int i = 0; i<rnd.length ; i++ ){
            rnd[i] = rnd1.nextInt(100);
            System.out.println(rnd[i]);
        }
    }
}
