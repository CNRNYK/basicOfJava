package assignments_reviews.repl;
import java.util.Scanner;
/*
1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi

 */
public class repl_0064 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        String solve = "";
        if (word.length()%2==0){
            if (word.length()>2){
                for (int i = 0 ; i < word.length()/2 ; i++){
                    solve = word.substring(word.length()/2-1, word.length()/2+1);
                }
            }else {
                solve = word.substring(word.length()/2-1, word.length()/2+1).concat(word.substring(word.length()/2-1, word.length()/2+1));
            }

        }else {

            if (word.length()>=3){
                for (int i = 0 ; i < word.length()/2 ; i++){
                    solve = String.valueOf(word.charAt(word.length()/2));
                }
            }else {
                solve += String.valueOf(word.charAt(0))+String.valueOf(word.charAt(0))+String.valueOf(word.charAt(0));
            }


        }
        System.out.println(solve);
    }
}
