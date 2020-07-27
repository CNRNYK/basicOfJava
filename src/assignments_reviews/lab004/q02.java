package assignments_reviews.lab004;

public class q02 {
    public static void main(String[] args) {
        int[] x = {1,2,3}; //= > false
        int[] y = {1,2,3,1};// = > true
        int[] z = {1,2,1};// = > true
        int[] k = {1}; // = > not a valid array
        /*System.out.println(equalsFirstLast(x));
        System.out.println(equalsFirstLast(y));
        System.out.println(equalsFirstLast(z));
        System.out.println(equalsFirstLast(k));*/
        equalsFirstLast(x);
        equalsFirstLast(y);
        equalsFirstLast(z);
        equalsFirstLast(k);

    }

    private static void equalsFirstLast(int[] pK) {
        if(pK.length>1){
            if (pK[0]==pK[pK.length-1]){
                System.out.println(true);
            }else System.out.println(false);
        }else{
            System.out.println("not a valid array");
        }
    }
}
