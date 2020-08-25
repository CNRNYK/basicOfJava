package days_tasks.part1.week_004.day_0011__controlFlowStatements_Part5;

public class nestedForLoops {
    public static void main(String[] args){

        for (int i = 0 ; i < 5 ; i++ ){

            System.out.println( i+1 + " Outer");

            for(int z= 0 ; z < 5 ;z++){

                System.out.println(z+1  + " Inner Loop");
            }
        System.out.println("");
        }

        //

        for (int i = 0 ; i < 5 ; i++ ){

            System.out.println( i+1 + " Outer");

            for(int z= 0 ; z < 5 ;z++){

                System.out.println(z+1  + " Inner Loop");
                if (z==4){
                    System.out.println("");
                }

            }

        }


    }
}
