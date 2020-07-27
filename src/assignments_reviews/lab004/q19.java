package assignments_reviews.lab004;

public class q19 {
    public static void main(String[] args) {
        int[] x = {1,2,2};// = > 5
        int[] y = {1,2,2,6,99,99,7};// =>5
        int[] a = {1,1,6,7,2};// = > 4
        int[] b = {1,1,6,2};// = > 2
        int[] c = {1,2,2,6,99,99,7,3,4};// = > 12
        System.out.println(sumOf(x));
        System.out.println(sumOf(y));
        System.out.println(sumOf(a));
        System.out.println(sumOf(b));
        System.out.println(sumOf(c));
    }

    private static int sumOf(int[] x) {
        int sum = 0;
        for (int z =0 ; z<x.length ; z++){
            go:
            if(x[z]!=6){
                sum += x[z];
            }else {
                for (int k = z ; k < x.length; k++ ){
                    if (x[k]!=7){
                        z++;
                        continue;
                    }else break go;
                }
            };
        }
        return sum;
    }
}
