package days_tasks.week_010.day_0036;

public class Campus {
    private String city;
    static String country;

    static {
        System.out.println("static block 1");
        country="USA";
    }
    public Campus (String city){
        System.out.println("Constructur");
        this.city=city;
    }
    static {
        System.out.println("static block 2");
        country = "Last";
    }


}
