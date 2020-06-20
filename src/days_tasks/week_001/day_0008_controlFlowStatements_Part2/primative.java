package days_tasks.week_001.day_0008_controlFlowStatements_Part2;

import java.util.Scanner;

public class primative {

	public static void main(String[] args) {

		byte byteValue = 35;
		short shortValue = 2044;
		int intValue = 2345678;
		long longValue = 23456789234L;
		
		float floatValue = 23.42f;
		double doubleValue = 23.42;
		
		char charValue = 'A';
		int x = 'A'; // 65 is 'A' value for unicode
		
		boolean booleanType = true;
		
		/*
		 *  Declaration
		 *  
		 *  Declare single variable
		 */
		
		int apple;
		
		/*
		 * Declare multiple variable
		 */

		int bananas;
		int oranges;
		
		int lemons,domato,pepper;
		/*
		 * Declare single variable and assign value in 1 statement
		 */
		
		int kiwi = 2;
		
		/*
		 * declare and assign multiple variable in single statement
		 */
		
		int waterlemon =4, grapes=34, apricots= 0;
		
		/*
		 * USING VARIBALE
		
		
		int num1,num2,num3;
		num1= 100;
		num2 = 500
				num1;
		num3 = num2;
		
		System.out.println(num1 + " " + num2 + " " + num3);
		
		double rate, delta, salary, bonus, time, mass, a , t , v, b;
		
		b= rate*rate + delta;
		b= 2*(salary+bonus);
		b = 1/(time+3*mass);
		b = (a-7)/(t+9*v);
		
		
		
		 * 
		 * 
		 */
		
		int ga = 10;
		int gb = 20;
		ga = gb^ga^(gb=ga);
		System.out.println("a " + ga + " b " + gb);
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		
		int t = scanner . nextInt();
		
		System.out.println("Your number is : " + t);
		
		
	}
		
	}


