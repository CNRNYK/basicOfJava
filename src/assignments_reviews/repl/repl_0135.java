package assignments_reviews.repl;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class repl_0135 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code
        ArrayList<String> words = new ArrayList<>();
        int begin =0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)==' '){

            words.add(sentence.substring(begin,i));
            begin = i+1;
            }
            if (i==sentence.length()-1){
                words.add(sentence.substring(begin,i+1));
            }
        }
//        for (String printout:words
//             ) {
//            System.out.println(printout);
//        }
        int k = words.size();
        String reversed = "";
        for (int z = words.size() ; z>0; z--) {
            reversed += words.get(k-1)+" ";
            k--;
        }
        reversed = reversed.substring(0, reversed.length()-1);
        System.out.println(reversed);
        //System.out.println(words.toString());
    }
}