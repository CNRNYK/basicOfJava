package assignments.assignment_004;
import java.util.Scanner;
public class Question_014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Book quantity");
		int quantity = myObj.nextInt();
		int point = 0;
		 // I KNOW I SHOULD ABLE TO WRTITE THIS CODE WITH SWITCH CODE
		if (quantity == 0) {
			System.out.println(point);
			
		}else if (quantity <= 1) {
			point=5;
		System.out.println(point);	
		}else if (quantity <= 2) {
			point=15;
		System.out.println(point);	
		}else if (quantity <= 3) {
			point=30;
		System.out.println(point);	
		}else {
			point=60;
		System.out.println(point);	
		}

	}

}
