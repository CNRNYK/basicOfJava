package days_tasks.week_007.day_0020_StringClasses;

import java.sql.SQLOutput;

public class indexOF {
    public static void main(String[] args) {
        String word1 = "github";
        System.out.println(word1.indexOf("g"));
        System.out.println(word1.indexOf("hub"));

        System.out.println(word1.indexOf("java")); // if dont exist gives -1

        String url = "www.okta.com";
        int i = url.indexOf(".");
        System.out.println(i);

        System.out.println(url.charAt(i+1));

        String title = "Java - Google Search";
        int x = title.indexOf("-");
        System.out.println("K" + title.charAt(x-1) + title.charAt(x-1) + "K");

        String country = "United States of America";
        int states = country.indexOf("States");
        System.out.println(states);


        String word2 = "java, c++, python, tomcat, eclipse";
        System.out.println(word2.contains("c++"));

        int c= word2.indexOf("c++");
        if (c>0){
            System.out.println("It includes");
        }




    }
}
