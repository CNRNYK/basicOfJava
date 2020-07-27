package assignments_reviews.lab004;


import java.util.Arrays;

public class q08 {
    public static void main(String[] args) {
        int[] x = {2,5}; //= > true
        int[] y = {4,3}; //= > true
        int[] z = {4,5}; //= > false

        System.out.println(twothree(x));
        System.out.println(twothree(y));
        System.out.println(twothree(z));
    }

    private static boolean twothree(int[] Px) {
        for (int value: Px) {
            if(value==3 || value==2){
                return true;
            }
        }
            return false;

    }
}
