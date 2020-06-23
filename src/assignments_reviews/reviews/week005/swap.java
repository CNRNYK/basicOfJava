package assignments_reviews.reviews.week005;

public class swap {
    public static void main(String[] args) {
        swap(10 , 20);

    }
    public static void swap(int a , int b){
        b = a+b;
        a = b-a;
        b = b-a;
        System.out.println(a +" "+ b);

    }
}
