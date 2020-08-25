package days_tasks.part1.week_007.day_0021_StringClasses;

public class SubString {
    public static void main(String[] args) {

        String chars = "{{}}";
        String word = "Automation";

        String result = chars.substring(0,2) + word + chars.substring(2, 4);
        System.out.println(result);
    }
}
