package assignments_reviews.repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class repl_0103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(", ");
        Arrays.sort(arr);
        String shortest = arr[0];
        ArrayList<String> shorts = new ArrayList<String>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < shortest.length()) {
                shortest = arr[i];
            }
        }
        int len = shortest.length();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()==len){
                shorts.add(arr[i]);
            }

        }
        System.out.println(shorts.toString());
    }
}