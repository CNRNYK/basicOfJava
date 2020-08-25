package days_tasks.part1.week_001.day_0008_controlFlowStatements_Part2;

import java.util.*;
import java.util.Scanner;

public class task_0003_Arithmetic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		/*

		Question-1
		Write a program to convert gallons into Liters and display it.

		        Sample output:

		      15 gallon is 56.7812 liter

		*/

		 

		double gallonPerLitre = 3.75/4;
		double gallon = 4;
		double litre = gallon * gallonPerLitre;

		System.out.println(gallon + " gallon " + litre + " litredir.\r\r");
	
		System.out.println("--------------------------------------\r\r");

		 
		/*

		Question-2

		Write a program - > Declare variables for your name and birth year, and the program will display:
		      " Hello, Ozzy! Based on your input, your age is 15 :) "
		*/

		 
		int today = Calendar.getInstance().getTime().getYear() +1900;    

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object

		    System.out.println("Enter birth year");
		    int myBirthday = myObj.nextInt();// Read user input
		   
		    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter your name");
		    String Name = myObj2.nextLine();// Read user input

		    
		    System.out.println(Name + " age is: " + (today-myBirthday) +"\r\r");

	
		String yourName = "Caner";
		int today1, birthday;
		today1 = 2020;
		birthday = 1984;
		int age = today1 - birthday;
		System.out.println("Hello" + yourName +" Based your input, your age is " + age + "\r\r");
		
		System.out.println("--------------------------------------\r\r");
		

		/*

		Question-3
		Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
		area = width * height

		*/

		 

		double width, height, area;
		width = 4.5;
		height = 7.9;
		area = width*height;
		System.out.println("Area of the rectangle is " + area + "\r\r");

		System.out.println("--------------------------------------\r\r");

		/*

		Question-4

		Declare 2 variables (Num1, Num2)

		Swap values between Num1 and Num2

		Display new values of Num1 and Num2

		      Sample output:

		      n1=10

		      n2=20

		      ----------

		      n1=20

		      n2=10

		  */

		int n1 = 10;
		int n2 = 20;
		int n3;

		System.out.println("Num1 =" + n1 + "\rNum2= " + n2 + "\r\r");


		n3 = n1;
		n1 = n2;
		n2 = n3;

		System.out.println("Num1 =" + n1 + "\rNum2= " + n2 );
		System.out.println("--------------------------------------\r\r");
		 

		/*
		 
		Question-5

		Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.
		-Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds
		-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
		-Assign values to the hours, minutes, seconds variables
		-Display the result

		      Sample Output:		 

		      inputSecond is 3695
		      1 hours, 1 minutes, and 35 seconds
		*/

		 

		int hours,minutes,seconds,inputSeconds;
		inputSeconds=3601;
		
		seconds = inputSeconds%60;
		hours = inputSeconds/3600;
		minutes = inputSeconds/60-(hours*60);
		

		System.out.println("Hours is =" + hours + " Minunte is= " + minutes + " Seconds is =" + seconds);
		System.out.println("--------------------------------------\r");

		 
		/*

		 

		Question-6

		Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.		 
		Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.

		      Sample Output	 

		      Number of milligrams in drink: 500

		      It would take about 20 drinks for a lethal overdose

		*/

		int gram,miligram;
		miligram = 500;

		double piece = 10000 / miligram;
		System.out.println("Number of milligrams in drink: " + miligram );
		System.out.println("It would take about " + piece  +" drinks for a lethal overdose");
		System.out.println("--------------------------------------\r\r");


		/*      

		Question-7
		
		Write a program that determines the change to be dispensed from a vending machine.
		An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar bill to pay for the item.
		 
		      Sample output

		      Price in cents : 95

		      Your change is 0 quarters, 0 dimes, and 1 nickle 

		  */

		/*
		int amount, quarters, dimes, nickels, pennies,exchange;
		
		amount=45;
		
		exchange= 100-amount;
		
		System.out.println("Price in cents: "+exchange+"cents");
		
		quarters=exchange/25;
		exchange=exchange%25;
		dimes=exchange/10;
		exchange=exchange%10;
		nickels=exchange/5;
		exchange=exchange%5;
		pennies=exchange;

		System.out.println("Your change is "+quarters+ " quarters, " +dimes+ " dimes, " + nickels+ " nickels, " + pennies + " pennies.");
		
		*/
		
		// Ahmet solution question 7 
		
		final int ONEDOLLAR = 100;
		int quarters, dimes, nickles, priceOfItemCents;
		int remcents;
		priceOfItemCents = 35;
		
		remcents = ONEDOLLAR - priceOfItemCents;
		
		quarters = remcents / 25;
		System.out.println(quarters);
				
		dimes = (remcents % 25);
		//System.out.println(dimes);
		int remDimes = dimes / 10;
		System.out.println(remDimes);
		
		nickles = dimes % 10;
		//System.out.println(nickles);
		int remNickles = nickles / 5;
		System.out.println(remNickles);
		
		System.out.println("Price in cents : " + priceOfItemCents);
		System.out.println("Your change is " + quarters + " quarters, " + remDimes + " dimes and  " 
		+ remNickles + " nickles.");

	}

}
