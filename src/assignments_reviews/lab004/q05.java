package assignments_reviews.lab004;

import java.util.Arrays;

public class q05 {
    public static void main(String[] args) {
        int[] x = {1,2,3}; // = > [2,3,1]
        int[] y = {17,12,10,8};// = > [12,10,8,17]
        int[] a = {7,0,0}; // = > [0,0,7]
        System.out.println(Arrays.toString(reverse(x)));
        System.out.println(Arrays.toString(reverse(y)));
        System.out.println(Arrays.toString(reverse(a)));
        System.out.println("------------");
        System.out.println(Arrays.toString(rotateLeft(x)));
        System.out.println(Arrays.toString(rotateLeft(y)));
        System.out.println(Arrays.toString(rotateLeft(a)));
    }

    private static int[] reverse(int[] pX) {
        int[] temp = new int[pX.length];
        int l = pX[0];
        for(int z =0 ; z<pX.length-1; z++){
            temp[z] = pX[((pX.length-1)-z)];
        }
        temp[temp.length-1]= l;
        return temp;
    }
    public static int[] rotateLeft(int[] arr) {

        int x = arr[0]; //1

        for(int i=0;i<arr.length-1;i++) {

            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = x;

        return arr;

    }
}
