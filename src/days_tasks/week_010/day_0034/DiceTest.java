package days_tasks.week_010.day_0034;

public class DiceTest {
    public static void main(String[] args) {

        final int Six_Sides = 6;

        Dice sixDice = new Dice(Six_Sides);

        rollDice(sixDice);

    }
    public static void rollDice(Dice d){


        System.out.println("Rolling " + d.getSides() + " sided dice");

        System.out.println("the dice value : " + d.getValue());
    }
}
