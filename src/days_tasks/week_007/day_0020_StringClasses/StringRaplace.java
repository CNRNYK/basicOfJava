package days_tasks.week_007.day_0020_StringClasses;

public class StringRaplace {
    public static void main(String[] args) {

        String str ="Moscow is capital of Russia";

        str = str.replace("Moscow","Ankara").replace("Russia","Turkey");

        System.out.println(str);

        String email = "firstname_lastname@gmail.com";
        String company = "capitalone";

        String newEmail = email.replace("gmail", company);
        System.out.println(newEmail);

        System.out.println(email.replace(".", "!"));

        System.out.println("------------------------");

        String result = "Yaklaşık 4.680.000.000 sonuç bulundu (0,56 saniye)";
        result = result.replace("Yaklaşık ", "").replace(" sonuç bulundu (0,56 saniye)", "");
        System.out.println(result);

        System.out.println("------------");
        System.out.println(timeStamp("10/10/2020 15:45:45"));


    }
    public static String timeStamp(String str){

        str = str.replace("/", "").replace(":", "").replace(" ", "");

        return str;

    }
}
