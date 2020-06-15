package assignments.assignment_004;
import java.util.Scanner;
public class Question_009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
				Weight of Package	Rate per 500 Miles Shipped
				2 pounds or less	$1.10
				Over 2 pounds but not more than 6 pounds	$2.20
				Over 6 pounds but not more than 10 pounds	$3.70
				Over 10 pounds	$3.8
		 * 
		 * 
		 * 
		 */
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input your item weight");
		double weight = myObj.nextDouble();
		System.out.println("Please input your shipping mile");
		int mile = myObj.nextInt();
		double price;
		
		
		
		if (weight<=2) {
		price = ((mile/500)+1)*1.1;	
		}
		else if(weight<6) {
			price = ((mile/500)+1)*2.7;	
		}
		else if(weight<10) {
			price = ((mile/500)+1)*3.7;	
		}
		else  {
			price = ((mile/500)+1)*3.8;	
		}
		System.out.println("You should pay " +price);
		
		

	}

}
