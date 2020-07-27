package assignments_reviews.lab004;

import java.util.Arrays;

public class q23 {
    public static void main(String[] args) {
        fizzArray(4);// → [0, 1, 2, 3]
        fizzArray(1);// → [0]
        fizzArray(10);// →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    private static void fizzArray(int i) {
        int[] cArray = new int[i];
        for(int z = 0; z < i  ; z++){
            cArray[z]  = z;
        }
        String out = Arrays.toString(cArray);
        System.out.println(out);
    }
}
