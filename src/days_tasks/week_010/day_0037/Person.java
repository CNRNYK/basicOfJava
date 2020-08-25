package days_tasks.week_010.day_0037;

public class Person {
    String name;
    int age;
    char gender;

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void walk(){
        System.out.println(name + " is walking");
    }
    public void sleep(int hours){
        System.out.println(name + " is sleeping " + hours + " hours");
    }

}
