package days_tasks.week_001.day_0006_logicalOperators;

public class someCodes {
	
        static final double PI = 3.14159;
        short yarıçap;
        static double daireninAlanı;

        double alanBul(int r) {

               int yçap = r;
               daireninAlanı = PI * yçap * yçap;
               return daireninAlanı;
        }

        public static void main(String[] args) {

               someCodes d1 = new someCodes();
               daireninAlanı = d1.alanBul(3);
               
               System.out.println(daireninAlanı);
               System.out.println(someCodes.daireninAlanı);
               System.out.println();

               someCodes d2 = new someCodes();
               daireninAlanı = d2.alanBul(5);
               
               System.out.println(daireninAlanı);
               System.out.println(someCodes.daireninAlanı);

        }

}

