package days_tasks.week_005.tasks;


public class Task_60 {
    public static void main(String[] args){
        calculate(6,3,"+");
        calculate(6,3,"-");
        calculate(6,3,"/");
        calculate(6,3,"*");
        calculate(6,3,"d");


    }
    public static void calculate(int value1, int value2, String sign){

        switch (sign){
            case "+":
                System.out.println(value1+value2);
                break;
            case "/":
                System.out.println(value1/value2);
                break;
            case "-":
                System.out.println(value1-value2);
                break;
            case "*":
                System.out.println(value1*value2);
                break;
            default:System.out.println("Hatalı giriş yaptınız");
        }

    }
}
