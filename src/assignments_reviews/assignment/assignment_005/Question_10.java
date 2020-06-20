package assignments_reviews.assignment.assignment_005;

public class Question_10 {
    public static void main(String[] args){
        /*
        Print following output using nested for loops:
1
22
333
4444
55555
666666
7777777
         */

        for (int z = 1 ; z<=7 ; z++){

            for (int t=1; t<=z ; t++){
                System.out.print(z);
            }
            System.out.println();
        }

    }
}
