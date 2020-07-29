package assignments_reviews.repl;

public class repl_0123_2 {
    public static void main(String[] args) {
        /*
        year 1 - growth 1 cm
        tree size: 1cm
         */

        // your code
        // ----------------------------
        int cm = 0;
        int tCM= 0;
        for(int year=1;year<=10;year++){
            if(year<4){
                cm = 1;
                tCM = tCM +cm;
                System.out.println("year "+year+" - growth "+cm+" cm");
                System.out.println("tree size: "+tCM+"cm");
            }else{
                cm = 2;
                tCM = tCM + cm;
                System.out.println("year "+year+" - growth "+cm+" cm");
                System.out.println("tree size: "+tCM+"cm");
            }

        }
    }
}