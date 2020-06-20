package assignments_reviews.assignment.assignment_005;

public class Question_05 {
    public static void main(String[] args){
        /*Print the table of 12 using for loop.
Output should be in following format:
12 X 1 = 12
12 X 2 = 24
12 X 3 = 36
12 X 4 = 48
12 X 5 = 60
12 X 6 = 72
12 X 7 = 84
12 X 8 = 96
12 X 9 = 108
12 X 10 = 120

         */
        int value = 12;
        for(int z=1 ; z<=10 ; z++){
            System.out.println(value + " x " + z + " = "+(z*value) );
        }

    }
}
