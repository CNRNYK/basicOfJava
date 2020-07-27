package assignments_reviews.lab004;

public class q16 {
    public static void main(String[] args) {
        int[] x = {2,1,2,3,4};// = > 3
        int[] y ={2,2,0};// =>3
        int[] z = {1,3,5};// = > 0
        System.out.println(evens(x));
        System.out.println(evens(y));
        System.out.println(evens(z));

    }

    private static int evens(int[] x) {
        int sum = 0;
        for (int values: x) {
            if (values%2==0){
                sum++;
            }
        }
        return sum;
    }
}
