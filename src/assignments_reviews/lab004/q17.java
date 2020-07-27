package assignments_reviews.lab004;

import java.util.Arrays;

public class q17 {
    public static void main(String[] args) {
        int[] x = {10,3,5,6};// = > 7
        int[] y = {7,2,10,9};// = > 8
        int[] z = {2,10,7,2};// = > 8
        System.out.println(variation(x));
        System.out.println(variation(y));
        System.out.println(variation(z));
    }

    private static int variation(int[] x) {
        Arrays.sort(x);
        int var = x[x.length-1] - x[0];
        return var;
    }
}
