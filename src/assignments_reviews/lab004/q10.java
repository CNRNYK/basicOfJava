package assignments_reviews.lab004;

public class q10 {
    public static void main(String[] args) {
        int[] x = {2,2}; // = > true
        int[] y = {3,3}; // = > true
        int[] a = {2,3}; // = > false
        int[] b = {12,20,42}; //  = > false
        int[] c = {2,2,2}; // = > false
        System.out.println(twice(x));
        System.out.println(twice(y));
        System.out.println(twice(a));
        System.out.println(twice(b));
        System.out.println(twice(c));
    }

    private static boolean twice(int[] Px) {
        int countY = 0;
        int countX = 0;
        for (int i=0 ; i<Px.length ; i++){
            if (Px[i]==2) {
                countX = countX +1;
            }
            if (Px[i]==3) {
                countY = countY +1;
            }
        }
        if (countX==2||countY==2){
            return true;
        }
        return false;
    }
}
