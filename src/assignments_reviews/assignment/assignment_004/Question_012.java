package assignments_reviews.assignment.assignment_004;
import java.util.Scanner;

public class Question_012 {
	public static void main(String args[]){
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Entry package model");
		
		String model = myObj.nextLine();
		System.out.println("Total hour");
		
		int hours = myObj.nextInt();
		
		
		double price;
		
		
		
		
		switch (model) {
		case "A" :
			price = 9.95;
				if (hours>10) {
					price = price + (2 * ( hours - 10)) ;}
			System.out.println("You will charge " + price + " $");
			//break;
		
		case "B" :
			price = 13.95 ;
			if (hours>20) {
				price = price + (2 * ( hours - 20)) ;}
			System.out.println("You will charge " + price + " $");
			break;
		
		case "C" :
			price = 19.95;
			System.out.println("You will charge " + price + " $");
			break;
		
		default : System.out.println("Not vaild input");
		
		}	
	}
}
