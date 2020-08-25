package days_tasks.part1.week_008.day_0024_arrays;

public class cars {
    public static void main(String[] args) {
        String[] car = {"porshe","mazda","haonda","porshe","mazda"};
        boolean flag = false;
        for (int z = 0 ; z < car.length ; z++){
            if (car[z].equals("honda")){
                flag = true;

                break;
            }
        }
        if  (flag){
            System.out.println("Found it");}
        else {
            System.out.println("Not found it");
        }
    }
}
