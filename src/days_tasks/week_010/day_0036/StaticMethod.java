package days_tasks.week_010.day_0036;

public class StaticMethod {

    static String name = "Apple";
    int age = 10;

    public static void show1(){

        // show2(); => you can not call instance method or variable from static method
        show4(); // => you can call static method from static method
        System.out.println(name); // => you can call static method from static method
        // System.out.println(age); // => you can not call instance method or variable from static method
    }
    public void show2(){
        show1(); // => you can call static method from instance method
        show3(); // => you can call static method from instance method
        System.out.println(name); // => you can call static method from instance method
        System.out.println(age); // => you can call static method from instance method
    }
    public void show3(){

    }
    public static void show4(){

    }
}
