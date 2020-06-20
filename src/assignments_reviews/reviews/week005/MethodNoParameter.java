package assignments_reviews.reviews.week005;

public class MethodNoParameter {
    public static void main(String[] args) {
        count1to10();
        aTOz();
    }
    public static void count1to10(){
        for(int k=1 ; k<= 10; k++){
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void aTOz(){
        for (char letter ='A'; letter <= 'Z' ;letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
    }
}
