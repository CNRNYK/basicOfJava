package days_tasks.week_008.day_0025_arrays;

public class ReturnArray {
    public static void main(String[] args) {
        double[] values;
        values =  getArray();

        for(double num : values){
            System.out.print(num + "  ");
        }

    }
    public static double[] getArray(){
        double[] array = {1.2, 0  ,2 ,1223.2 };

        return array;
    }

}
