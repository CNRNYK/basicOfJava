package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0120 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        for(int z=0; z<4;z++){
            if(words[z].length() > words[z+1].length()){
                words[z+1] =  words[z];
            }
        }
        System.out.println(words[words.length-1]);

    }

}