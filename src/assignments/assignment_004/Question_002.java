package assignments.assignment_004;
import java.util.Scanner;

public class Question_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long income; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your income:");
		
		income = scanner.nextInt();
		
		System.out.println("Your Income : " + income);
		
		if (income <= 150000000) {
			double tax;
			tax = (income/100)*25;
			System.out.println("The tax amount you have to pay :" + tax);
		}
		
		else if (income > 150000000 || income<= 300000000) {
			long tax;
			tax = ((150000000/100)*25) + (((income - 150000000)/100)*30);
			System.out.println("The tax amount you have to pay :" + tax);
		}
		
		else if (income > 300000000 || income<= 600000000) {
			long tax;
			tax = ((150000000/100)*25) + ((300000000/100)*30) + (((income - 450000000)/100)*35);
			System.out.println("The tax amount you have to pay :" + tax);
		} 
		
		else if (income > 600000000 || income<= 1200000000) {
			long tax;
			tax = ((150000000/100)*25) + ((300000000/100)*30) + ((600000000/100)*35) + (((income - 1050000000)/100)*40);
			System.out.println("The tax amount you have to pay :" + tax);
		} 
		
		else if (income > 1200000000) {
			long tax;
			tax = ((150000000/100)*25) + ((300000000/100)*30) + ((600000000/100)*35) + ((150000000/100)*40) + (((income - 1200000000)/100)*50) ;
			System.out.println("The tax amount you have to pay :" + tax);
		}
	}
}
