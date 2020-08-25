package days_tasks.part1.week_008.day_0024_arrays;

public class arrray {
    public static void main(String[] args) {
        int[] mylist ={1,2,3,4};

        String[] myArray = {"Apple","Orange","Banana"};

//        System.out.println(mylist[0]);
//        System.out.println(mylist[1]);
//        System.out.println(mylist[2]);
//        System.out.println(mylist[3]);

        System.out.println(mylist.length);

        for (int i =0  ; i < myArray.length  ; i++){
            System.out.println(myArray[i]);
        }

        int[] scores = {100,23,87,0,5,554,7,745,67,56,6,74,567,4,567,5,43,674,56,7,456,34,45,5,67,8,89,8,6,78,6};
        int ava  =  0;
        for (int z =0; z<scores.length;z++ ){

            ava +=  scores[z];

        }

        System.out.println("Avarege of the scores: "+ava/scores.length);
    }
}
