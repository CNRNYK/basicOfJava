package days_tasks.week_008.day_0027_arrays;

import java.util.Arrays;

public class pizza2d {
    public static void main(String[] args) {
        String[][] pizzas ={
                {"pinneapple","peperonnni"},
                {"ancovies","mushroom","olives"},
                {"4 cheese"},
                {"chicken","tomatos","onioons"},
                {"green peppers","zuccini","brocoli","spinach","shrimp"}
        };

        System.out.println(Arrays.toString(pizzas[0]));

        System.out.println("-------------");

        for (String pizza: pizzas[3]) {
                System.out.println(pizza);
        }

        System.out.println("-----------\n");
        for (int z =0; z<pizzas.length; z++){
            for(int k = 0 ; k<pizzas[z].length;k++){
                System.out.print(pizzas[z].length + " ");
                System.out.print(pizzas[z][k] +" ");
            }
            System.out.println();
        }

        int[][] students = {{4,5,6},{12,5,7,1},{12,3,42,2}};

        for (int[] group: students) {
            System.out.println();
            for (int studentId: group) {
                System.out.print(studentId +" ");
            }
        }

    }
}
