package days_tasks.week_005.tasks;

public class Task_63 {
    public static void main(String[] args){
        calculateCelsius(32);
        calculateCelsius(50);
    }
    public static void calculateCelsius(int fahrenheit){
        double celsius = (fahrenheit-32)/1.8;
        System.out.println(celsius);
    }
}
