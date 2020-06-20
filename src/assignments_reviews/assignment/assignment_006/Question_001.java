package assignments_reviews.assignment.assignment_006;

public class Question_001 {
    public static void main(String[] args) {
        /*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
         */
        for (int lineNumber = 1; lineNumber <= 8; lineNumber++) {
            for (int cNumber = 1; cNumber < lineNumber; cNumber++) {
                System.out.print(cNumber);
                if (cNumber == 7) {
                    System.out.println();
                    for (int decNumber = 7; decNumber >= 1; decNumber--) {
                        for (int kNumber = 1; kNumber < decNumber; kNumber++) {
                            System.out.print(kNumber);
                        }System.out.println();
                    }

                }


            }System.out.println();
        }
    }
}
