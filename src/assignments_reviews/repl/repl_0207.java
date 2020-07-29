package assignments_reviews.repl;

import java.util.Arrays;

public class repl_0207 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(do_switch(arr)));
    }
    public static int[] do_switch(int[] i){
        int l  = i[0];
        i[0] = i[i.length-1];
        i[i.length-1]  = l;
        return i;
    }
}