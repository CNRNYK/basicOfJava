package days_tasks.week_006.day_0017_OOP2;

public class BMW {
    String make = "Not selected";
    String model = "Not selected";
    double price = 0;

    public void showPrice(){

        switch (model){
            case "330i":
                price=40250;
                break;
            case "740i":
                price= 85000;
                break;
            case "m3":
                price= 65000;
                break;
            default :
                price = 0;

        }
        System.out.println(price);
    }
}
