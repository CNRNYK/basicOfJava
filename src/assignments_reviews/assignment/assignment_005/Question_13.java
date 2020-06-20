package assignments_reviews.assignment.assignment_005;

public class Question_13 {

    public static void main(String[] args) {

        for (int z = 1; z <= 8; z++) {
            for (int k = 1; k <= 8; k++) {

                if (k % 2 == 0) {
                    if (z % 2 == 0)
                        System.out.print("W");
                    else System.out.print("B");
                }

                if (k % 2 != 0) {
                    if (z % 2 == 0)
                        System.out.print("B");
                    else {
                        System.out.print("W");
                    }

                }

            }
            System.out.println();



        }


    }
}

