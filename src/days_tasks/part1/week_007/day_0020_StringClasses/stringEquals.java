package days_tasks.part1.week_007.day_0020_StringClasses;

public class stringEquals {
    public static void main(String[] args) {

        String s1 = "Welcome to java";
        String s2 = "Welcome to java";
        String s3 = "Welcome to c++";

        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equals(s3);
        System.out.println(b1 + " " + b2);

        String s4 = new String("Welcome to java");
        boolean b3 = s1==s4;
        boolean b4 = s1.equals(s4);
        System.out.println(b3 + " " + b4);

    }
}
