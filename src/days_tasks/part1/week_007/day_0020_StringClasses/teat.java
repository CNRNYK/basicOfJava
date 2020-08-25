package days_tasks.part1.week_007.day_0020_StringClasses;

import java.util.Scanner;

public class teat {
    public static void main(String[] args) {
        //target = target.substring(0,3);
        //zSystem.out.println(main);
        //target = target.substring(0,3).concat(word).concat(target.substring(3,target.length()));

        //System.out.println(target);
        //test(target,word);

        //First ask user for a screen size.
        // If screen size is equals to 13.3, add  $200 to the laptop price.
        // If screen size is equals to  15.0 - add  $300 to the laptop price.
        // If screen size is equals to  17.3 - add  $400 to the laptop price.
        // Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price.
        // If CPU type equals to i5, add  $250 to the laptop price.
        // If CPU type equals to i7, add  $350 to the laptop price.
        // Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type.
        // There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.
        // If it's SSD - add $100 to the laptop price for every 500GB.
        // Then ask user for for screen resolution.
        // There are 2 options: FULLHD and 4K.
        // Add $100 if it's FULLHD screen and $200 if it's 4K screen.

        Scanner scan = new Scanner(System.in);
        double price = 0;
        String storageType, screenType, cpu;
        int ram=0;
        int memorySize =0;

        System.out.println("Select screen size:");
        screenType = scan.nextLine();
        if (screenType.equals("13.3")){ price= price+200; }
        else if(screenType.equals("15.0")){ price= price+300; }
        else if(screenType.equals(17.3)){ price= price+400; }

        System.out.println("Select CPU type:");
        cpu = scan.nextLine();
        if (cpu.equals("i3")){ price = price  + 150;}
        if (cpu.equals("i5")){ price = price  + 250; }
        if (cpu.equals("i7")){ price = price  + 350; }

        System.out.println("Select RAM size:");
        ram  = scan.nextInt();
        price = ram/4 * 50;

        System.out.println("Select storage type:");
        storageType = scan.nextLine();

        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();

        switch (storageType){
            case "HDD":{
                price += (memorySize/500)*50;
                break;
            }
            case "SSD":{
                price  +=(memorySize/500)*100;
            }
        }


        System.out.println("Enter screen resolution:");
        screenType= scan.nextLine();

        if (screenType.equals("FULLHD")){
            price  += 100;
        }else if (screenType.equals("4K")){
            price  += 200;
        }
        System.out.println("Laptop price is: $"+price);
        //Display message: Laptop price is: $1050.0
    }

}

