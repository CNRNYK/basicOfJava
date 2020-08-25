package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0139 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        if(size<2){
            System.out.println(num[0]);
        }else {
            System.out.println(num[0] +", " + num[1]);
        }
    }
}