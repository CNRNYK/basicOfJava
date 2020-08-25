package days_tasks.part1.week_008.day_0027_arrays;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] nums = {12,123,4,23,412,4};

        //toString()
        System.out.println("toString method : " + Arrays.toString(nums));

        //equals()
        int[] nums1 = {4,4,56,23,13,4};
        int[] nums2 = {4,4,56,23,13,4};
        System.out.println("equals method : " + Arrays.equals(nums1,nums2));

        //sort() : sorts array in ascending order
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] languages = {"Zulu","Spanish","Italian","English","Polish","Arabic","arabic","1arabic"};
        Arrays.sort(languages);
        System.out.println(Arrays.toString(languages));

        //binarySearch()
        int[] nums3 = {56,23,13,4};
        // int[] nums4 = Arrays.sort(nums3); => not working
        System.out.println("binarySearch() method : " + Arrays.binarySearch(nums3,4));  // printed firstone
        System.out.println("binarySearch() method : " + Arrays.binarySearch(nums3,12)); // (-(-insertPoint-1))
        System.out.println("binarySearch() method : " + Arrays.binarySearch(nums3,14)); // in the binarySearch() method sorted values and then gives the index point

        //copyOf()
        double[] d1 = {2.3,13.2,32.1};
        double[] d2 = d1;
        System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d2));

        d1[0] = 100.3;
        System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d2));

        double[] d3 = Arrays.copyOf(d2,5 );
        System.out.println(Arrays.toString(d3));

        d2[0] = 5.2;
        System.out.println(Arrays.toString(d2));
        System.out.println(Arrays.toString(d3));

        //String : == and .equals()
        //Array : referance equality and copyOf()  => copyOf method creates new methods but referance equality is copies arrays fully


    }
}
