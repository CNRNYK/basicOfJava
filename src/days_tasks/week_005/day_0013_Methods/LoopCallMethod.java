package days_tasks.week_005.day_0013_Methods;

public class LoopCallMethod {
    public static void main(String[] args){
        System.out.println("Hello from main method");
        /*for (int i =0 ; i <5 ; i++){
            displayMethod();
            System.out.println("Back in the method");
        }*/
        System.out.println("80 miles is ");
        convertKM();

        sumNumber();


    }

    public static void displayMethod() {
        System.out.println("Hello from displayMessage method");
    }

    public static void convertKM(){
        double miles = 80;
        double km = miles *1.609344;
        System.out.println(km);

    }
    public static void sumNumber(){
        int a=1;
        int b=2;
        System.out.println(a+b);
    }
}
