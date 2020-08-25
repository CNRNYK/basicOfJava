package days_tasks.week_010.day_0034;

import java.util.Random;

public class Dice {
    int sides;
    int value;

    public Dice(int numSides){
                sides = numSides;           // assigned
                roll();
    }
    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(sides) +1; // assigned object value
     }

     public int getSides(){
        return sides;
     }

    public int getValue() {
        return value;
    }

    public Dice() {
    }

    public Dice(int sides, int value) {
        this.sides = sides;
        this.value = value;
    }
}
