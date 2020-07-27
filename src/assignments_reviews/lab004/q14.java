package assignments_reviews.lab004;

import java.util.Arrays;

public class q14 {
    public static void main(String[] args) {
        int[] x = {1,2};
        int[] x1 = {4,4};
        int[] x2 = {9,2,1,3,5,5};
        int[] y = {3,4};// = > [1,2,3,4]
        int[] y1 = {2,2};// = > [4,4,2,2]
        int[] y2 = {3,4};// = > [9,2,3,4]
        System.out.println(Arrays.toString(merge(x,y)));
        System.out.println(Arrays.toString(merge(x1,y1)));
        System.out.println(Arrays.toString(merge(x2,y2)));
    }

    private static int[] merge(int[] x, int[] y) {
        int[] merged = new int[x.length+y.length];
         for(int z = 0 ; z<x.length ; z++){
             merged[z] = x[z];
        }
         int p = 0;
         for(int z = x.length ; z<(x.length+y.length) ; z++){
             merged[z] = y[p++];
        }
         return merged;

    }
}
