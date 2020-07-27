package assignments_reviews.lab004;

import java.util.Arrays;

public class q11 {
    public static void main(String[] args) {
        int[] x = {1,2,3};// = > [1,2,0]
        int[] y = {2,3,5};// = > [2,0,5]
        int[] z = {1,2,1};// = > [1,2,1]
        int[] q = {11,2,13,3,2};// = > [11,2,13,3,2]
        System.out.println(Arrays.toString(changeFollowed23(x)));
        System.out.println(Arrays.toString(changeFollowed23(y)));
        System.out.println(Arrays.toString(changeFollowed23(z)));
        System.out.println(Arrays.toString(changeFollowed23(q)));
    }

    private static int[] changeFollowed23(int[] Pq) {
        for (int z = 0; z<Pq.length-1; z++){
            if (Pq[z]==2&&Pq[z+1]==3) {
                Pq[z+1]=0;
            }
        }
        return Pq;
    }
}
