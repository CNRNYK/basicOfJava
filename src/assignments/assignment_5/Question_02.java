package assignments.assignment_5;

public class Question_02 {
    public static void main(String[] args){
        /*
        Question-2:

        Write a program that displays all odd numbers between 3-130 in the same line

         */

        for (int i=2; i<130 ; i++){
            if (i%2==1){
                System.out.print(i + " ");
            }
        }
    }
}
