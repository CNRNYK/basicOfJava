package assignments_reviews.lab004;

import java.util.Arrays;

public class q01 {
    public static void main(String[] args) {
        int[] x = {1,2,5,1,3,6,7};
        System.out.println(firstLast6(x));
        System.out.println(contains6(x));
    }

    private static boolean firstLast6(int[] Px) {
        //Arrays.sort(Px);
        if (Px[0] ==6 || Px[Px.length-1] ==6){   //Arrays.binarySearch(Px,6)>0
            return true;
        }else return false;
    }
    private static boolean contains6(int[] Px) {
        //Arrays.sort(Px);
        if (Arrays.binarySearch(Px,6)>0){   //
            return true;
        }else return false;
    }
}
