package days_tasks.week_008.day_0027_arrays;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int[][] x = {{1, 2, 1}, {2, 1}, {3, 2, 1}};
        int[][] y = {{2, 1, 2}, {3, 2}, {1, 3, 2}};
        int[] p = new int[x.length];

        for(int z = 0 ; z < x.length; z++){
            for (int l = 0; l<x[z].length;l++) {
                System.out.print(x[z][l] + " ");
            }
            System.out.println();
        }

    }
}