package assignments_reviews.repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_0174 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i=0; i < size; i++){
//            nums[i] = scan.nextInt();
//        }
//        String i = "sdf";
//        i.substring(0,3);
//        printUniqueNumbers(nums);
        //int z = 0;
        //String[] words =  new String[]{"caner","caasdf"};
        int[] nums  =  new int[]{1, 33, 5, 7, 9};
        Arrays.sort(nums);
//        for (int z=0; z<5; z++){
            System.out.println(nums[nums.length-1]);
        int sums=0;
            for (int sum: nums) {
            if (sum%2==0){

                sums++ ;
            }
        }System.out.println(sums);
//        }
//                .concat(words[z].charAt[words.lenght]));
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE



    }
}