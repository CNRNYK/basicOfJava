package assignments_4.copy;
import java.util.Scanner;

public class Question_3 {
	public static void main(String args[]) {
		
		int year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year");
		year = scanner.nextInt();
		
		if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
			
			System.out.println("Leap Year");
			
		} 
		else {
					 System.out.println("Not leap year");					
				}
			

		
		
		
	}



}

