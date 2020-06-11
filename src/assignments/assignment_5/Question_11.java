package assignments.assignment_5;

public class Question_11 {
    public static void main(String[] args){
        /*
        Print the following output using nested for loops.

4       3       2      1

     3       2      1

         2       1

              1
         */

        for (int i = 4; i > 0; i--) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.print("\n");

        }
    }
}
