package days_tasks.week_005.tasks;

public class Task_0067 {
    public static void main(String[] args) {
        System.out.println(lastDigit(155,5));


    }
    public static boolean lastDigit(int first, int second){
        boolean con;
        if ( first%10 == second%10){
         con= true;
        }else con=false;
        return con;
    }

}
