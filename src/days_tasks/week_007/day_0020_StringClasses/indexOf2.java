package days_tasks.week_007.day_0020_StringClasses;

public class indexOf2 {
    public static void main(String[] args) {
        // index of two values
        String list = "html-selenium-angular-jenkins-grid";
        int firstDash = list.indexOf("-");
        System.out.println(firstDash);

        int secondDash = list.indexOf("-",5);
        System.out.println(secondDash);

        int thirdDash = list.indexOf("-" ,secondDash+1);
        System.out.println(thirdDash);

        int lastDash = list.lastIndexOf("-");
        System.out.println(lastDash);

        String str1 = "Caner";
        String str2 = "ne";



        System.out.println("--------------");
        test(str1,str2);



    }
    public static void test(String str , String str2 ){

        if (str.contains(str2)){
            System.out.println(str.indexOf(str2));
        }
    }
}
