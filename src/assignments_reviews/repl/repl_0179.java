package assignments_reviews.repl;
import java.util.*;

public class repl_0179 {
        public static void main(String[] args) {
            //test your code
            System.out.println( uniqueChars("wooden-spoon") ) ;
        }

        public static String uniqueChars(String str) {

            String temp = "";
            for (int i = 0; i < str.length(); i++){

                char current = str.charAt(i);
                if (temp.indexOf(current) < 0){
                    temp = temp + current;
                }
            }
            return temp ;
        }
    }








