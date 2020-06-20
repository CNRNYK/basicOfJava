package days_tasks.week_005.tasks;

public class Task_62 {
    public static void main(String[] args){
        calculateGreates(25,15,11);

    }
    public static void calculateGreates(int a, int b, int c){


        if(a > b && a > c)
        {
            System.out.println("Largest number is:"+a);
        }
        else if(b > c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }


    }
}
