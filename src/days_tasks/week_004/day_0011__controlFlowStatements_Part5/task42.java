package days_tasks.week_004.day_0011__controlFlowStatements_Part5;

public class task42 {
    public static void main(String[] args) {

        int sumEven=0;
        int sumOdd=0;





        for(int i=1; i<100 ; i++) {

            if(i%2==0) {

                sumEven=sumEven+i;
                System.out.print(" ");
                //System.out.println("Sum of even number " + sumEven);

            }else {

                sumOdd=sumOdd+i;
                //System.out.println("Sum of odd number " + sumOdd);

            }
        }

        System.out.println("Sum of even number " + sumEven);
        System.out.println("Sum of odd number " + sumOdd);
    }
}