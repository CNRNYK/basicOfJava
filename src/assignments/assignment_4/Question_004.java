package assignments.assignment_4;
import java.util.Scanner;
public class Question_004 {
	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Entry to call count: ");
		int callCount = myObj.nextInt();
		double price;
		if (callCount <=100 ) {
			System.out.println("200");
		}	else if (callCount <= 150) {
			price = 200 + (callCount-100)*0.6;
			System.out.println(price);
		}	else if (callCount <= 200) {
			price = 200 + 50*0.6 + (callCount-150)*0.5;
			System.out.println(price);
		}	else if (callCount > 200) {
			price = 200 + 50*0.6 + 50*0.5 + (callCount-150)*0.4;
			System.out.println(price);
		}
		
	}

}
