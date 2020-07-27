package assignments_reviews.lab004;

import java.util.Arrays;

public class q07 {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        int[] y = {};  // = > [1,3]
        int[] a = {7,4,6,2};
        int[] b = {}; // = > [7,2]

        System.out.println(Arrays.toString(values(x, y )));
    }

    private static int[] values(int[] Px,int[] Py) {
        Py = new int[2];  // created new  object THAT IS IMPORTANT
        Py[0] = Px[0];
        Py[1] = Px[Px.length-1];
        return Py;
    }
}
