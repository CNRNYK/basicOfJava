package days_tasks.part1.week_008.day_0025_arrays;

import java.util.Arrays;
import java.util.Random;

public class PsssArray {
    public static void main(String[] args) {

        int[] numbers = new int[4];

        getValues(numbers);

        System.out.println("Here are the numbers that you entered ");
        showArray(numbers);

    }

    private static void showArray(int[] pNumbers) {

        for (int value :  pNumbers){
            System.out.println(value);
        }
            System.out.println(Arrays.toString(pNumbers));

    }

    private static void getValues(int[] pNumbers) {
        Random rnd1 = new Random();
        for (int i = 0 ; i<pNumbers.length ; i++){
            pNumbers[i] = rnd1.nextInt(100);
        }
    }
}
