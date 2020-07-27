package assignments_reviews.lab004;

public class q20 {
    public static void main(String[] args) {
        int[] x = {1,2,2}; //= > true
        int[] y = {1,2,1,2};// =>false
        int[] a = {2,1,2};// = > false
        int[] b = {2,2,1,2};// = > true
        System.out.println(twotwo(x));
        System.out.println(twotwo(y));
        System.out.println(twotwo(a));
        System.out.println(twotwo(b));
    }

    private static boolean twotwo(int[] input) {
        boolean ret = false;
        for(int z = 0 ; z < input.length-1 ; z++){
            if (input[z] ==2 & input[z+1]==2){
                ret = true;
            }
        }
        return ret;
    }
}
