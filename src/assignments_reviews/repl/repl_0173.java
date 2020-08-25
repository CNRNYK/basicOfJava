package assignments_reviews.repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_0173 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);
        for(int i=0 ;i<=rows-1;i++){
            if(arr[0][arr.length-1] > arr[1][arr.length-1]){
                for(int j=0 ;j<=cols;j++){
                    arr[i][j]=arr[0][arr.length-1];
                }//end for cols
            }else {
                for(int j=0 ;j<=cols;j++){
                    arr[i][j]=arr[1][arr.length-1];
                }
            }
        }//end for rows



        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));


    }
}