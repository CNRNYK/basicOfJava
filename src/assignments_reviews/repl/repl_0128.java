package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0128 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        for (int z=0;z<temps.length;z++ ) {
            total = total +temps[z];
        }
        avgTemp=total/temps.length;
        System.out.println(avgTemp);

    }
}