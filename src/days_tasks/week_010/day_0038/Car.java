package days_tasks.week_010.day_0038;

public class Car extends Vehicle{
    int maxSpeed = 180;

    public void display(){
        System.out.println("max speed " + maxSpeed);
        System.out.println("max speed " + super.maxSpeed);
    }
}
