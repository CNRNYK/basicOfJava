package assignments_reviews.repl;

import java.util.Scanner;

public class repl_0102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        int begin, end1, end2, end3 ;
        String id;
        if(!html.contains("<html>")){
            System.out.println("Invalid input!");
        }else {

            begin = html.indexOf("<a") +1;
            end1 = html.indexOf(">",begin+1);
            id = html.substring(begin+1,end1);
            if  (html.contains("id=")) {
                begin = html.indexOf("id=")+4;
                end2 = html.indexOf("\"", begin + 1);
                id = html.substring(begin, end2);
            }else if (id.contains(".")){
                begin = id.indexOf(".") +1;
                end2 = id.indexOf(".",begin+1);
                id = id.substring(begin,end2);
            }
            System.out.println(id);
        }

    }
}