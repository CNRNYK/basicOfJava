package days_tasks.week_004.day_0011__controlFlowStatements_Part5;

public class task51 {
    public static void main(String[] args){

       // int rows = 6;

        for(int hours=1;hours<=12;hours++) {


            for(int minutes=0;minutes<=59;minutes++) {


                for(int seconds=0;seconds<=59;seconds++) {


                    System.out.println(hours+":"+minutes+":"+seconds); //window preferences run debug console limit console output


                    //System.out.printf("%02d:%02d:%02d\n",hours,minutes,seconds);

                }
            }
        }
    }
}

