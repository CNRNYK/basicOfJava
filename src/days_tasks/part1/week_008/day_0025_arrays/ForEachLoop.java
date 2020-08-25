package days_tasks.part1.week_008.day_0025_arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] product = {"Timberland","Shirt","Watch","Bag","Shoes"};
        double[] price = {120.3 , 123.1, 123.1, 1254,1, 123.1 , 234};

        for (String prod : product){
            System.out.println(prod);
        }
        System.out.println("------------");
        for (double pr : price){
            System.out.println(pr);
        }

    }
}
