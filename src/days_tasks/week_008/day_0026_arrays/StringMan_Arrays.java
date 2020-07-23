package days_tasks.week_008.day_0026_arrays;

public class StringMan_Arrays {
    public static void main(String[] args) {
        String[] myCar = {"Honda","Mercedes","BMW","Toyota","Ford    "};
        System.out.println(myCar[0].length());
        System.out.println(myCar[1].charAt(2));
        System.out.println(myCar[4].trim());
        System.out.println(myCar[2].substring(2,3));
        System.out.println(myCar[1].equals(myCar[2]));
        System.out.println(myCar[0] == myCar[4]);

        System.out.println("------------");

        for (int i=0 ;i<myCar.length;i++){
            System.out.println(myCar[i].trim().length());
        }

    }
}
