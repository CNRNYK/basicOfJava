package days_tasks.week_008.day_0027_arrays.lab4;

public class q04 {
    public static void main(String[] args) {
        int[] x = {1,2,3}; //= > 6
        int[] y = {5,11,2}; //= > 18
        int[] z = {7,0,0}; //= > 7
        int[] a = {3,-2,10,4}; // = > 15

        int sume = 0;
        for (int sum: x) {
            sume = sum + sume;
        }
        System.out.println(sume);
        sume = 0;
        for (int sum: y) {
            sume = sum + sume;
        }
        System.out.println(sume);
        sume = 0;
        for (int sum: z) {
            sume = sum + sume;
        }
        System.out.println(sume);
        sume = 0;
        for (int sum: a) {
            sume = sum + sume;
        }
        System.out.println(sume);
    }
}
