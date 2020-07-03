package days_tasks.week_007.day_0019_StringClasses;

import java.util.Scanner;

public class charAt {
    public static void main(String[] args) {
        String str1 = "Computer";

        System.out.println(str1.length());
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(3));
        System.out.println(str1.charAt(4));
        System.out.println(str1.charAt(5));
        System.out.println(str1.charAt(6));
        System.out.println(str1.charAt(7));
        //System.out.println(str1.charAt(8));
        System.out.println("------------");

        String str2 ="Apple";
        if (str2.charAt(0)=='A'){
            System.out.println("A is first char");
        }else
        {   System.out.println("A is not first char");}

        System.out.println("--------------------");

        char assigned = str1.charAt(0);
        System.out.println(assigned);
        System.out.println("--------------------");

        String str3 = "civic";
        if (str3.charAt(0)==str3.charAt(4) ){
            System.out.println("There are same");
        }else {
            System.out.println("There are different");
        }
        System.out.println("----------------");

        char lastChar = (str3.charAt(str3.length()-1));
        System.out.println("last char is str3 " +lastChar);

        System.out.println("------------");
        String str4 = "Cybertek School";
        for (int x = 0; x<str4.length(); x++){
            System.out.println(str4.charAt(x));
        }

        System.out.println("-------------");

        Scanner myObjs = new Scanner(System.in);
        String str5 = myObjs.nextLine();
        if (str5.length()==2){
            if (str5.charAt(0)==':'){
                if (str5.charAt(1)==')'){
                    System.out.println("Smile");
                }
            }
            else if (str5.charAt(0)==';'){

            }
        } else
            {
                System.out.println("Invalid input");}
    }





    }

