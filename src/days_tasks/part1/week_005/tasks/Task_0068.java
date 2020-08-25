package days_tasks.part1.week_005.tasks;

public class Task_0068 {

    public static void main(String[] args) {
        yearsUntilRetirement("Mike",1980);
    }

    public static void yearsUntilRetirement(String name,int year) {  //name=MiKE  year=1950
        //retirement age = 65 - age
        int retiremenAge = 65 - calculateAge(year);
        System.out.println(name  + " retires in " + retiremenAge + " years");
    }


    public static int calculateAge(int yearBirth) {
        return 2020-yearBirth;

    }

}