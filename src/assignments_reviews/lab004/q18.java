package assignments_reviews.lab004;

public class q18 {
    public static void main(String[] args) {
        int[] x = {1,2,2,1};// = > 6
        int[] y={1,1};// =>2
        int[] a = {1,2,2,1,13};// = > 6
        int[] b = {13,1,2,2,1,13,3};// = > 6
        System.out.println(sumOf13(x));
        System.out.println(sumOf13(y));
        System.out.println(sumOf13(a));
        System.out.println(sumOf13(b));
    }

    private static int sumOf13(int[] x) {
        int sum = 0;
        for (int z = 0 ; z < x.length ; z++ ){
            if (x[z] != 13){
                sum += x[z];
            }else break;
        }
        return sum;
    }
}
