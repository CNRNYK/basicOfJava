package days_tasks.week_007.day_0023_Random;

import java.util.Random;

public class task_0084 {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0 ; i < 10 ; i++ ){

            if (rnd.nextBoolean()) {
                System.out.println("Tails");
            }else System.out.println("Heads");

        }
    }
}
