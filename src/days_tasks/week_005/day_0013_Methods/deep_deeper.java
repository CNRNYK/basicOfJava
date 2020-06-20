package days_tasks.week_005.day_0013_Methods;

public class deep_deeper {
    public static void main(String[] args){
        System.out.println("This is main");
        deep();
        System.out.println("This is main again");

    }
    public static void deep(){
        System.out.println("This is deep");
        deeper();
    }
    public static void deeper(){
        System.out.println("This is deeper");
    }
}
