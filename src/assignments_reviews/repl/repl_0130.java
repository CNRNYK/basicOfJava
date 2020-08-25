package assignments_reviews.repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class repl_0130 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int temp = nums[0];
        for (int i = 1; i < size; i++) {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1] = temp;

        System.out.println(Arrays.toString(nums));
        ArrayList<String> names = new ArrayList<>();
        //ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Student> youguys = new ArrayList<>();

    }

    private static class Student {
    }
}