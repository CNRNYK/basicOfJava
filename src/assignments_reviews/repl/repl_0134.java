package assignments_reviews.repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class repl_0134 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        ArrayList<Boolean> flags = new ArrayList<>();
//        for (int i = 0; i < inner.length; i++) {
//            for (int j = 0; j < outer.length; j++) {
//                if(inner[i]==outer[j]){
//                    if(outer[j]==outer[j+1]&&inner[j]==inner[j+1]){
//                        break;
//                    }
//                    flags.add(true);
//                }
//            }
//        }
//        if (flags.size()==inner.length){
//            System.out.println(true);
//        }else System.out.println(false);
     boolean isIn=false;
        for(int i = 0; i < inner.length; i++){
            isIn = false;
            for(int j = 0; j < outer.length; j++){
                if(inner[i]==outer[j]){
                    isIn= true;
                    if(i < inner.length -1)
                        i++;
                    else break;
                }
                else isIn = false;
            }
            if(!isIn)
                break;
        }

        System.out.println(isIn);
    }
}