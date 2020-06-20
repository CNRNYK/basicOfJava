package assignments_reviews.assignment.assignment_004;
import java.util.Scanner;

public class Question_005 {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter day: ");
		int day = myObj.nextInt();
		System.out.println("Enter month: ");
		int month = myObj.nextInt();
		System.out.println("Enter year: ");
		int year = myObj.nextInt();
		if (month*day == year) {
			System.out.println("the date is magic");
		} else {
			System.out.println("the date is not magic");
		}
		 
		
		

			
		
		
	}
	

}
