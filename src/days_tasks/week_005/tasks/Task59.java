package days_tasks.week_005.tasks;


public class Task59 {
    public static void main(String[] args){
    PayCalculation(4,15);

    }

    public static void PayCalculation(double hours, double hourlyPay){

        double pay = hours*hourlyPay;
        System.out.println(pay);
    }

}
