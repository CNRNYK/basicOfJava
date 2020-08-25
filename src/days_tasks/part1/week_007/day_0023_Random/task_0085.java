package days_tasks.part1.week_007.day_0023_Random;

import java.util.Random;

public class task_0085 {
    public static void main(String[] args) {
        Random rnd1 = new Random();
        int equals =0;
        int userC= 0;
        int compC = 0;

        for (int i = 0 ; i < 10 ; i++){

            int comp = rnd1.nextInt(6)+1;
            int user = rnd1.nextInt(6)+1;
            if (comp>user){
                System.out.println("user win");
                compC++;
            }else if (comp<user){
                System.out.println("user win");
                userC++;

            }else {
                System.out.println("Equals");
                equals++;
            }

        }

        System.out.println(userC + " times you win \n" + compC + " times comp wins \n" + equals + " same");
        System.out.println("----------------");
        if ( compC> userC){
            System.out.println("computer is big boss");
        } else  if(compC<userC){
            System.out.println("you are the big boss");
        }else System.out.println("You are tied");

    }
}
