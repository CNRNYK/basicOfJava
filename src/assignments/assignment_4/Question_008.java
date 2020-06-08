package assignments.assignment_4;
import java.util.Scanner;

public class Question_008 {

	public static void main(String[] args) {
		
		final double amount= 99; // Giving the price of item
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter quantity");
		double quantity = myObj.nextDouble(); // Input for quantity
		double price;

		if (quantity < 10) {
			price = amount*quantity;
			System.out.println("First Price " + amount*quantity + " Price: " +price + " Total discount =0");
		}
		else if (quantity < 20) {
			price = ((amount*quantity)-((amount*quantity)*0.2));
			System.out.println("First Price " + amount*quantity + " price: " +price + " Total discount = " + ((amount*quantity)*0.2) );
		}
		else if (quantity < 50) {
			price = ((amount*quantity)-((amount*quantity)*0.3));
			System.out.println("First Price " + amount*quantity + " price: " +price + " Total discount = " + ((amount*quantity)*0.3) );
		}
		else if (quantity < 100) {
			price = ((amount*quantity)-((amount*quantity)*0.4));
			System.out.println("First Price " + amount*quantity + " price: " +price+ " Total discount = " + ((amount*quantity)*0.4) );
		}
		else {
			price = ((amount*quantity)-((amount*quantity)*0.5));
			System.out.println("First Price " + amount*quantity + " price: " +price+ " Total discount = " + ((amount*quantity)*0.5) );
			
		}
		

	}

}
