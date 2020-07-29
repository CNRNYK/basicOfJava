package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0117 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below
        for(int z=0 ; z<6 ; z++){
            System.out.println(arr[z]+ " , "+arr[z+1]+ " , "+arr[z+2]);
            z++;
        }
    }
}