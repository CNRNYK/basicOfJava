package assignments_reviews.lab004;

public class q24 {
    public static void main(String[] args) {
        int[] x = {1, 2, 1, 3};
        int a = 2; // Output: false
        int[] y = {1, 2, 1, 3};
        int b = 1; //Output: true
        System.out.println(checker(a, x));
        System.out.println(checker(b, y));
    }

    public static boolean checker(int number, int[] arr) {
        for(int i=0 ; i<arr.length-2 ; i++) {
            if(arr[i]==number && (arr[i+1]==number || arr[i+2]==number)) {
                return true;
            }
        }
        return false;

//        boolean check = false;
//        if( arr[number-1] ==  a){
//            check = true;
//        }
//        return check;
    }
}
