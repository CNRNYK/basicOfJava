package assignments_reviews.assignment.assignment_004;
import java.util.Scanner;
public class Question_013 {
	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Entry your check count");
		int checkCount = myObj.nextInt();
		int regularPrice = 10;
		double price = 0;
		
		if ( checkCount < 20) {
			price = regularPrice + (0.1 * checkCount);
		}
		else if ( checkCount < 40) {
			price = regularPrice + ((0.08 * ( checkCount - 20 )) + 2 );
		}
		else if ( checkCount < 60) {
			price = regularPrice + ((0.06 * ( checkCount - 40 )) + 3.6 );
		}
		else if ( checkCount > 60) {
			price = regularPrice + ((0.04 * ( checkCount - 60 )) + 4.8 );
		}
		System.out.println("Your price is " + price);
		
		
	}

}