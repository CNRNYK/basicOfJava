package assignments_reviews.repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_0129 {
    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
       ArrayList<String> myList = new ArrayList<>();
        for (String retur:arr) {
            if (retur.contains("e")){
                myList.add(retur);
            }
        }

        System.out.println(myList);
        String[] fewValues= myList.toArray(new String[0]);
        System.out.println(fewValues);
        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }



}