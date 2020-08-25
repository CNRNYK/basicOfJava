package days_tasks.week_010.day_0036;

public class CanerEncapssulationTest {
    public static void main(String[] args) {
        CanerEncapsulation o1 = new CanerEncapsulation();


        System.out.println(o1.getInt1());
        System.out.println(o1.getS1());

        System.out.println("--------");

        o1.setInt1(5);
        o1.setS1("Caner");
        System.out.println(o1.toString());
        System.out.println(o1.getInt1());
        System.out.println(o1.getS1());
    }
}
