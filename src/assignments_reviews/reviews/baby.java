package assignments_reviews.reviews;


import java.util.Scanner;

public class baby {
    public static void main(String[] args) {
        Scanner   mys = new Scanner(System.in);
        System.out.println("parrent 1 first name");
        String  p1 = mys.nextLine();
        System.out.println("parrent 2 first name");
        String  p2 = mys.nextLine();
        System.out.println("gender");
        String  g = mys.nextLine();
        String name= "";
        if (g.equals("f")){
            name += p1.substring(0,(p1.length()/2)) + p2.substring(p2.length()/2,p2.length());
        }else{
            name += p2.substring(0,(p2.length()/2)).concat(p1.substring(p1.length()/2,p1.length()));
        }
        System.out.println(name);
    }
}
