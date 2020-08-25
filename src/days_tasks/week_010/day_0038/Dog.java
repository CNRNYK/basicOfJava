package days_tasks.week_010.day_0038;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void move(int speed) {
        System.out.println("dog move called");
        super.move(speed);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat called");

        super.eat();
    }

    public void chew(){
        System.out.println("dog.chew() called");
    }


}
