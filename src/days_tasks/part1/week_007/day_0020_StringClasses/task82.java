package days_tasks.part1.week_007.day_0020_StringClasses;

import java.util.Scanner;

public class task82 {
    public static void main(String[] args) {
        String userName = "caner";
        String password = "123";
        input(userName,password);


    }

    public static void input(String pUsername, String pPassword){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Username");
        String username = myObj.nextLine();
        System.out.println("Enter Password");
        String password = myObj.nextLine();

        if (username.equals(pUsername) && password.equals(pPassword)){
            System.out.println("It matches");
        }else if (!username.equals(pUsername)){
            System.out.println("Hatalı Giriş");
        }
        if (password.equals(pPassword) && username.equals(pUsername)){
            System.out.println("It matches");
        }else if (!password.equals(pPassword)){
            System.out.println("Hatalı Giriş");
        }
    }

}
