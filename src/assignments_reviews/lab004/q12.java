package assignments_reviews.lab004;

public class q12 {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        int[] y = {1,3};    // Output = 2
        int[] x1 = {7,2,3};
        int[] y1= {1};      // Output = 1
        int[] x2 = {3,2,4};
        int[] y2 = {4,3,4};  // Output = 0
        System.out.println(howMuch(x,y));
        System.out.println(howMuch(x1,y1));
        System.out.println(howMuch(x2,y2));
    }

    public static int howMuch(int[] x, int[] y) {
        int t = 0;

            if(x[0]==1){
               t++;
            }
            if(y[0]==1){
                t++;
            }

        return t;
    }
}
