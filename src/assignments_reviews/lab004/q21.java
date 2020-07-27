package assignments_reviews.lab004;

public class q21 {
    public static void main(String[] args) {
        int[] x = {1,4,1};// = > true
        int[] x1 = {1,4,1,4,2,2,34,2,1,3,21,1};// = > false
        int[] x2 = {1,1};// = > true
        System.out.println(firstOne(x));
        System.out.println(firstOne(x1));
        System.out.println(firstOne(x2));

    }

    private static boolean firstOne(int[] input) {
        boolean sin =false;
        for (int x =0; x<4 ; x++){
            if (input.length<4){
                sin = true;
                break;
            }else if (input[0]>input[3]){
                sin = true;
                break;
            }else{
                sin = false;
                break;
            }
        }
        return sin;
    }
}
