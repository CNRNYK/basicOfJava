package days_tasks.part1.week_008.day_0024_arrays;

import java.util.Arrays;

public class task_91 {
    public static void main(String[] args) {
        int[] count = new int[10];
        int multipy = 19;
        int[] solve = new int[10];
        for (int i =0 ;i<count.length; i++){
            count[i] = i+1;
            solve[i] = count[i] * multipy;

        }
        System.out.println(Arrays.toString(solve));
    }
}
