package days_tasks.week_007.day_0019_StringClasses;

public class concat {

    public static void main(String[] args) {

        String word = "Java";

        System.out.println( word.concat(" selenium"));
        System.out.println(word.concat(" Eclipse"));

        System.out.println(word);

        System.out.println("------------");

        word = word.concat(" selenium");
        System.out.println(word);

        System.out.println("-----------");

        // word = word.concat(1234); // not working
        word = word.concat(" hello").concat(" new concat").concat(" what");
        System.out.println(word);

    }

}
