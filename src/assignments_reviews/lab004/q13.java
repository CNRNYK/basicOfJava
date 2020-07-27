package assignments_reviews.lab004;

import java.util.Arrays;

public class q13 {
    public static void main(String[] args) {
        int[] x1 = {1,2};
        int[] x2 = {5,6};
        int[] x3 = {1,1};
        int[] y1 = {3,4};// = > [3,4]
        int[] y2 = {3,8};//= > equal
        int[] y3 = {1,0};// = > [1,1]
        System.out.println(compare(x1,y1));
        System.out.println(compare(x2,y2));
        System.out.println(compare(x3,y3));
    }

    private static String compare(int[] x, int[] y) {
        int sumX = 0;
        int sumY = 0;
        for (int z: x) {
            sumX += z;
        }
        for (int z: y) {
            sumY += z;
        }
        if (sumX == sumY) {
            return "equal";
        }else if(sumX > sumY){
            return Arrays.toString(x);
        }else {
            return Arrays.toString(y);
        }
    }
}
