package assignments_reviews.repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_0121 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] test = sentence.split(" ");
        String[] test2 = sentence.split(" ");
        int x = 0;
        for(int z=test.length-1;z>=0;z--){
            test2[x]=test[z];
            x++;
            reversed = reversed.concat(test[z])+" ";
        }
        //reversed = test2[0]+" "+;
        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}