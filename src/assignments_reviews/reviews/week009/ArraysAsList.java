package assignments_reviews.reviews.week009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,465,54,54,48,485));
        nums.remove(0);
        nums.add(3);
        System.out.println(nums);

        List<Integer> num2 = new ArrayList<>(Arrays.asList(10,54,65));
        num2.add(123);
        num2.add(1,1345);
        num2.addAll(nums);
        System.out.println(num2);
        System.out.println(num2.size());

    }
}
