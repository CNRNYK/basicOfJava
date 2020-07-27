package assignments_reviews.lab004;

import java.util.Arrays;

public class q09 {
    public static void main(String[] args) {
        int[] x = {4,5,3,2,2,6}; //= > [0,0,0,0,0,6]
        System.out.println(Arrays.toString(doubles(x)));
    }

    private static int[] doubles(int[] Px) {
        Px = new int[Px.length*2];
        Px[Px.length-1] = Px.length;
        return Px;
    }
}
