package days_tasks.week_008.day_0027_arrays;

public class task0095 {
    public static void main(String[] args) {
        int[][] value = {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
        double stu1 = 0;

        for (int avarege: value[0] ) {
            stu1 =(stu1+ avarege);
        }
        System.out.println("Avg of student1 is : "+stu1/value[0].length);

        int math =0;
        for(int z =0 ; z<value.length; z++){
                math = math + value[z][0];
        }
        System.out.println("Total math score is: " + math);

    }
}
