package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0162 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        if (num == 1){
            System.out.println("0");
        }else if (num == 2 || num == 3){
            System.out.println("1");
        }
        else{

            int n1 =1;
            int temp =1;
            int sum =1;

            for (int i = 3 ; i <= num ; i++){   // 0, 1, 1, 2, 3, 5, 8, 13, 21
                                                // 1, 2, 3, 4, 5, 6, 7, 8 , 9
                sum = n1+temp;

                n1 =  temp;
                temp = sum;

            }
            System.out.println(sum);
        }
    }
}