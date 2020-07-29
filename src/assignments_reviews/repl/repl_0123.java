package assignments_reviews.repl;

import java.util.Arrays;
import java.util.Scanner;
public class repl_0123 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int decimal = input.nextInt();
            int[] binary = new int[8];

            //TODO: Write your code below.
        int k=0;
            for (int z = 7 ; z>=0 ; z--){
                if(decimal/Math.pow(2,z)>=1){
                    binary[k] = 1;
                    decimal = (int) (decimal-Math.pow(2,z));
                }else{
                    binary[k] = 0;
                }
                k++;
            }
        System.out.println(Arrays.toString(binary));
    }
}