package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {"java", "cable", "red", "vivid", "remedy", "grace","a"};//{scan.next(), scan.next(), scan.next(),scan.next(), scan.next(), scan.next()};


        int[] lengt = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            lengt[i] = str[i].length();
        }

        int maxValue = lengt[0];
        int index = 0;
        for(int a = 0; a < lengt.length; a++)
        {
            if(maxValue < lengt[a])
            {
                maxValue = lengt[a];
                index = a-1;
            }
        }
        System.out.println("Index of max value in array java: " + index);

    }
}