package days_tasks.part1.week_005.day_0013_Methods;

public class Lab1_Question4 {
    public static void main(String[] args){
        deerPlay(70,false);
        deerPlay(95,false);
        deerPlay(95,true);

    }
    public static void deerPlay(int entry, boolean isSummer){

        if (entry<=90 && entry>=60){
            System.out.println(true);
        }else if(entry<=100 && entry>=90 && isSummer){
            System.out.println(true);
        }else System.out.println(false);

    }

}
