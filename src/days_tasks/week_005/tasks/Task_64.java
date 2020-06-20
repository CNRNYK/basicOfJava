package days_tasks.week_005.tasks;

public class Task_64 {
    public static void main(String[] args){
        printPattern(10);
    }
    public static void printPattern(int patternGet){

        for (int pattern=1 ; pattern<=patternGet; pattern++){
            for(int i=1 ; pattern >= i ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
