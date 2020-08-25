package days_tasks.part1.week_005.day_0013_Methods;

public class creditCardMethod {
    public static void main(String[] args){

        double salary = 500000;
        int creditCard = 5;

        if (salary > 20000 && creditCard >= 7){
            qualify();

        }else{
            noQualify();
        }


    }

    public static void noQualify() {
        System.out.println("I am sorry, you are not qualified for the CC");
    }

    public static void qualify() {
        System.out.println("Congrat, you are qualified for the CC");
    }
}
