package assignments_reviews.repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_0124 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int temp = 0;
        int x =  6;
        for (int i = 0; i < 7 ; i++) {
            if(i==4)break;
            temp = nums[i];
            nums[i] =nums[x];
            nums[x]=temp;
            x--;
        }



        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}