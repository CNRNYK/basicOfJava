package days_tasks.week_005.day_0013_Methods;

public class Lab1_Question2 {
    public static void main(String[] args){
        love6(5,2);
        love6(1,6);
        love6(5,1);
    }
    public static void love6(int first, int second){
        if( first+second == 6 || first==6 || second==6 || first-second==6 || second-first==6) {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
