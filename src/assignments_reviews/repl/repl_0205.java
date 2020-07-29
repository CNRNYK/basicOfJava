package assignments_reviews.repl;

import java.util.Arrays;

public class repl_0205 {
    public static void main(String[] args) {
        int[] first = new int[]{10, 40, 50, 3, 1};
        int[] second = new int[]{11, 0, 500, 44, 1101};
        System.out.println(Arrays.toString(addElements(first,second)));

    }

    private static int[] addElements(int[] first, int[] second) {
        int[] sum = new int[first.length];
        for(int z=0 ; z<first.length;z++){
            sum[z] =  first[z] +second[z];
        }
        return sum;
    }
}
