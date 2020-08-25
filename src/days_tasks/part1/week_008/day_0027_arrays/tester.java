package days_tasks.part1.week_008.day_0027_arrays;

import java.util.Arrays;

public class tester {
    public static void main(String[] args) {
        int[] min =  {1,2,3,4,1,2};
        System.out.println("The min value is " + Arrays.toString(minValue(min)));

    }

    public static int[] minValue(int[] min) {
        int l= 0;
        int visited = -1;
        int[] frequency = new int[min.length];
        for (int z = 0 ; z< min.length ; z++){

            for(int k = z+1 ; k < min.length ; k++){
                if(min[z]==min[k]){

                frequency[l] = frequency[l]+1;
                min[k] = visited;

            }else{
                frequency[l]=1;
            }
            l++;
        }

        }
        return frequency;
    }
}
