package Gncr_Reviews;
import java.util.Scanner;
public class test {
    public static boolean isEven(int n)
    {
        boolean x= false;
        if(n%2 ==0){
            x= true;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(isEven(1));
        System.out.println(isEven(8));
    }
}