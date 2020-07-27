package assignments_reviews.lab004;

import java.util.Arrays;

public class q06 {
    public static void main(String[] args) {
        int[] aValue = new int[]{1,3,5,1,56,6};
        System.out.println(Arrays.toString(change(aValue)));
    }

    private static int[] change(int[] pValue) {
        Arrays.sort(pValue);
        for (int i =0 ; i<pValue.length-1 ; i++) {
            pValue[i] = pValue[pValue.length-1];
        }
        return pValue;
    }
}
