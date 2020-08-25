package days_tasks.part1.week_005.day_0013_Methods;

public class PassMultpleArguments {
    public static void main(String[] args){
        int ca =5;
        showSum(5,ca);
        showSum(5,123.123);

    }
    public static void showSum( int num1, double num2){

        System.out.println(num2 + num1);
    }
}
