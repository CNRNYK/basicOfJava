package assignments_reviews.lab004;

public class q03 {
    public static void main(String[] args) {
        int[] x = {1,2,3}; //= >true
        int[] y = {7,3};

        int[] x1 = {1,2,3}; //= >false
        int[] y1= {7,3,2};

        int[] x2 = {1,2,3}; //= > true
        int[] y2= {1,3};

        int[] x3 = {1}; //= > Array1 is not valid
        int[] y3= {7,3};

        int[] x4 = {1,2,3}; // = > Array2 is not valid
        int[] y4= {1};

        System.out.println(commonEnd(x,y));
        System.out.println(commonEnd(x1,y1));
        System.out.println(commonEnd(x2,y2));
        System.out.println(commonEnd(x3,y3));
        System.out.println(commonEnd(x4,y4));
    }

    private static String commonEnd(int[] Px, int[] Py) {
        if (!(Px.length>1)){
            return "x Array is not valid";
        }
        if (!(Py.length>1)){
            return "y Array is not valid";
        }
        if (Px[0]==Py[0] || Px[Px.length-1]==Py[Py.length-1]){
            return "true";
        }else return "false";
    }
}
