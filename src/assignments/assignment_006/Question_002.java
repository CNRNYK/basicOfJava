package assignments.assignment_006;

public class Question_002 {
    public static void main(String[] args){
        /*
        Write a Java program to print the following pattern

1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7

         */

        for (int lineNumber = 7; lineNumber > 0; lineNumber--) {

            for (int cNumber = 0; cNumber < lineNumber; cNumber++) {
                System.out.print(cNumber+1);

                if (lineNumber == 1) {

                    //System.out.println();
                    for (int decNumber = 1; decNumber < 8; decNumber++) {

                        for (int kNumber = 0; kNumber-1 <= decNumber; kNumber++) {
                            if(kNumber>1){
                            System.out.print(kNumber-1);
                            }
                        }
                        System.out.println();
                    }//System.out.println();
                }
            }
            System.out.println();
        }
    }
}

