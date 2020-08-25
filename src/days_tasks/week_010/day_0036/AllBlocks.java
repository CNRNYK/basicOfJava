package days_tasks.week_010.day_0036;

public class AllBlocks {

    public AllBlocks(int x){
        System.out.println("one argument constructor");
    }

    public AllBlocks(){
        System.out.println("No argument constructor");
    }

    static {
        System.out.println("First static block");
    }

    {
        System.out.println("first instance block");
    }

    {
        System.out.println("Second instance block");
    }

    static {
        System.out.println("Second static block");
    }

}
