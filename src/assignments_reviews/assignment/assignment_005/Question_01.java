package assignments_reviews.assignment.assignment_005;

public class Question_01 {
    public static void main(String[] args){
        /*
         Question-1:

Write a for loop that displays the following set of numbers:

0,10,20,30,40,50,...1000
         */

        int printCount = 0;

        for (int i=1 ; i<1001 ; i++){

            System.out.print(printCount);

            printCount = printCount + 10;
            if (printCount == 1010){
                break;
            }
            System.out.print(" ,");
        }


    }
}
