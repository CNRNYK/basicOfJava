package days_tasks.week_010.day_0038;

import java.util.Stack;

public class StaticTest {
    public static void main(String[] args) {
        StaticSub obj = new StaticSub();
        obj.num = 5;
        obj.print();
        StaticSuper.num =10 ;
        obj.print();
        System.out.println("StaticSub.num = " + StaticSub.num);

        StaticSub.m1(1);

        obj.m1(1);
        obj.m2();
    }
}
