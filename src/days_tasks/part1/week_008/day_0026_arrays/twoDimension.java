package days_tasks.part1.week_008.day_0026_arrays;

import java.util.Arrays;
import java.util.Random;

public class twoDimension {
    public static void main(String[] args) {
        int[][] array2D = new int[3][4];
        Random rnd = new Random();
        for(int i= 0; i<array2D.length;i++){
            for(int z=0;z<array2D.length;z++){
                array2D[i][z] = rnd.nextInt(100);
                System.out.print(array2D[i][z] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array2D));
    }
}
