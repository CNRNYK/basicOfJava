package assignments_4;
import java.util.Scanner;

public class Question_3 {
	public static void main(String args[]) {
		
		int year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year");
		year = scanner.nextInt();
		
		if (year%4 == 0) {
			if (year%100 == 0) {
				if(year%400 != 0) {
					System.out.println("Not leap year");
					
				} else {
					System.out.println("Leap Year");
				}
			}
			System.out.println("Leap Year");
			}
		}
		
	}

