package assignments_reviews.lab003;

import java.util.Scanner;

public class question004 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your word");
        String input = myScan.nextLine();
        System.out.println(firstTwo(input));
    }

    public static String firstTwo(String pInput){

        if (pInput.length() < 1){
            pInput = "XX";
        }else if (pInput.length() < 2){
            pInput = pInput.concat("X");
        }else {
            pInput = pInput.substring(0,2);
        }



        return pInput;
    }


}
