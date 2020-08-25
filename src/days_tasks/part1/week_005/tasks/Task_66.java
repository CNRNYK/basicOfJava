package days_tasks.part1.week_005.tasks;

public class Task_66 {
    public static void main(String[] args) {
        System.out.println(distanceCalculator(1.5, 85));
    }
    public static double distanceCalculator( double timeHours , double speed){
        double distance = timeHours * speed;
        return distance;
    }

}
