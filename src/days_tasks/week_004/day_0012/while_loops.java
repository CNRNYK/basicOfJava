package days_tasks.week_004.day_0012;

public class while_loops {
    /*
    while ( number <= 5) {

        System.out.println("Can");

    }

    do{

        System.out.println("Can");

        }while(number<=5)


     */



    public static void main(String[] args){

        int i=0;
        int sumEven = 0;


        while (i<100){

            if ( i%2 == 0){
                sumEven = sumEven + i;

            }
            System.out.println(sumEven);
            i++;

        }


    }
}

