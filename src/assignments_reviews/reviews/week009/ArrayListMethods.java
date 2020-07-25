package assignments_reviews.reviews.week009;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("McLean");
        cities.add("Alexandria");
        cities.add("Fairfax");
        cities.add("Falls Church");
        cities.add("Baltimore");
        cities.add("Berlin");
        cities.add("Amsterdam");
        cities.add(0,"Istanbul");
        System.out.println("add() method : " + cities);
        cities.add(2,"Ankara");
        System.out.println("add() method : " + cities);

        cities.set(2,"New York");
        System.out.println("set() method : " +cities);

        cities.remove(3);
        cities.remove("Berlin");
        System.out.println("remove() method : "+cities);
    }
}
