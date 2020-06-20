package assignments_reviews.assignment.assignment_005;

public class Question_03 {
    public static void main(String[] args){

        /*  Write a program that displays the number of even numbers between 5 and 50 (included)

         */
        int a = 0;

        for (int z = 5 ; z<=50 ; z++){
            if(z%2==0){
               // System.out.println(z + " ");
            a++;
            }
        }
        System.out.println(a);
    }
}
