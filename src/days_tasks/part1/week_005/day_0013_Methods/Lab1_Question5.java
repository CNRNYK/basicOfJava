package days_tasks.part1.week_005.day_0013_Methods;

public class Lab1_Question5 {
    public static void main(String[] args){
        caughtSpeed(60, false);
        caughtSpeed(65, false);
        caughtSpeed(65, true);
    }




    public static void caughtSpeed(int speed_, boolean birthday) {
        if (birthday) {
            if (speed_ <= 66) {
                System.out.println(0);
            }

            else if (speed_ <= 86) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }

        } else {
            if (speed_ <= 61) {
                System.out.println(0);
            }
            else if (speed_ <= 81) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }


        }
    }
}
