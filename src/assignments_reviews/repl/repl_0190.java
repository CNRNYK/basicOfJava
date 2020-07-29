package assignments_reviews.repl;

import java.util.Arrays;

public class repl_0190 {
    public static int[] mergR(int[] a, int[] b) {

        int[] merged = new int[a.length + b.length];
        for (int z = 0; z < a.length; z++) {
            merged[z] = a[z];
        }
        int p = 0;
        for (int z = a.length; z < (a.length + b.length); z++) {
            merged[z] = b[p++];
        }
        return merged;
    }//end mergR

    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        int[] y = {1,2,3,4};
        System.out.println(Arrays.toString(mergR(x, y)));
    }
}
