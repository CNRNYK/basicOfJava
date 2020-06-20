package days_tasks.week_005.day_0013_Methods;

public class Lab1_Questiion3 {
    public static void main(String[] args){
        spescialEleven(22);
        spescialEleven(23);
        spescialEleven(24);
        spescialEleven(0);
    }
    public static void spescialEleven(int entry){

        if ( entry%11 == 0 || (entry-1)%11 ==0 ) {

             //  System.out.println("False");
             System.out.println(true);

        } else System.out.println("False");

    }

}
