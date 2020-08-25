package days_tasks.week_010.day_0038;

public class Contractor extends Employee {

    @Override
    void calculatePay(int hours, double rate) {
        System.out.println("Employee total pay: " + ((hours*rate)+500));
        System.out.println("contractor");
    }

}
