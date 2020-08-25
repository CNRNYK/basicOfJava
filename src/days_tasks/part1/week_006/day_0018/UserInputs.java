package days_tasks.part1.week_006.day_0018;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter byte value");
        byte b1 = myScanner.nextByte();

        System.out.println("enter short value");
        short s1 = myScanner.nextShort();

        System.out.println("enter int value");
        int i1 = myScanner.nextInt();

        System.out.println("enter long value");
        long l1 = myScanner.nextLong();

        System.out.println("enter double value");
        double d1 = myScanner.nextDouble();

        System.out.println("enter boolean value");
        boolean bo1 = myScanner.hasNextLine();
    }
}
