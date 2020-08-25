package assignments_reviews.repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_0174 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for (int z=0 ; z<nums.length; z++){
            for (int k=0; k<nums.length; k++){
                if (nums[z]==nums[k] && k!=z ){
                    System.out.println("aynısı var");
                    System.out.println(nums[z]);
                }
            }
            System.out.println("--------------");

        }
    }
}