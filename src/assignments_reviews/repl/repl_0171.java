package assignments_reviews.repl;

import java.util.Arrays;

public class repl_0171{
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        String row;
        String col;
        char x ='a';
        for (int z =0; z<8;z++ ){
            for(int i= 0; i<8;i++){

                row = String.valueOf(z+1);
                col = String.valueOf(x);
                row=row.concat(col);
                chessBoard[z][i]  = row;
                x++;
            }
            x ='a';

        }
            //DO NOT CHANGE
            System.out.println(Arrays.deepToString(chessBoard));
    }
}