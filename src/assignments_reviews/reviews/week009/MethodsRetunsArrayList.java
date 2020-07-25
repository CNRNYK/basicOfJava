package assignments_reviews.reviews.week009;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MethodsRetunsArrayList {
    public static void main(String[] args) {
        System.out.println(getIntList(100));
        double[] d1 = new double[]{123.1,123.142};
        System.out.println(Arrays.toString(myArray(d1)));
        System.out.println("Random list : " +getRandomList(5));
    }
    public static List<Integer> getIntList(int size){
        List<Integer> numbers = new ArrayList<>();
        for(int i=1 ; i<= size; i++){
            numbers.add(i);
        }
        return numbers;
    }

    public static int[] myArray(double[] arr){
        int[] x = {1,234,3};
        return x;
    }

    public static List<Integer> getRandomList(int size){
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0 ; i<size ; i++){
            numbers.add(rnd.nextInt(100));
        }
        return numbers;
    }

}
