package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0092 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double fact=1;
        for (int z=1; z<=n; z++){
            fact = fact*z;
        }
        String te = String.valueOf(fact);
        System.out.println(te);
        if (te.contains("E") ){
            //te =  te.replace("E","0");
            te =  te.replace(".","");
            te =  te.substring(0,te.indexOf("E")).concat("000");
        }else {
            te =  te.replace(".0","");
            //te =  te.substring(0,te.indexOf("E")).concat("000");
        }
        System.out.println(te);

    }
}