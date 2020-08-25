package days_tasks.part1.week_005.day_0013_Methods;

public class Lab1_Question1 {
    public static void main(String[] args){
        stringTimes("Hi", 5);
        stringTimes("Hi", 2);
    }
    public static void stringTimes(String writer ,int count){
        String str ="";
        for (int c =1; c<= count; c++){
            str = writer + str;

            //System.out.print(writer);
        }
        System.out.println(str);
    }
}
