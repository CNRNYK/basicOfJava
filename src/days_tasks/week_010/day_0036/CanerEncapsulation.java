package days_tasks.week_010.day_0036;

public class CanerEncapsulation {
    private int int1;
    private String s1;

    @Override
    public String toString() {
        return "CanerEncapsulation{" +
                "int1=" + int1 +
                ", s1='" + s1 + '\'' +
                '}';
    }

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }
}
