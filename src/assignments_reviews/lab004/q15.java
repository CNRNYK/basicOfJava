package assignments_reviews.lab004;

import java.util.Arrays;

public class q15 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};// = > [4,2,3,1]
        int[] y = {1,2,3};// = > [3,2,1]
        int[] z = {8,6,7,9,5};// = > [5,6,7,9,8]
        System.out.println(Arrays.toString(chaged(x)));
        System.out.println(Arrays.toString(chaged(y)));
        System.out.println(Arrays.toString(chaged(z)));
    }

    private static int[] chaged(int[] z) {
        int first = z[0];
        int last = z[z.length-1];
        z[0] = last;
        z[z.length-1] = first;
        return z;
    }
}
