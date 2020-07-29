package assignments_reviews.repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_0122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        for (int i=0;i<nums.length;i++) {
            boolean check=false;
            for(int y=0;y<nums.length;y++) {
                if(i!=y) {
                    if(nums[i]==nums[y]) {
                        check=true;
                        break;
                    }
                }
            }
            if(!check) {
                System.out.println(nums[i]);
            }
        }
    }
}