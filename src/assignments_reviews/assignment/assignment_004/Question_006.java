package assignments_reviews.assignment.assignment_004;
import java.util.Scanner;
public class Question_006 {

	public static void main(String[] args) {

		double Weight, Mass;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter mass");
		Mass = myObj.nextDouble();
        Weight = Mass * 9.8;
        if (Weight >= 1000) {
        	System.out.println("Too heavy" + Weight);
        }else if(Weight <= 10 ) {
        	System.out.println("Too light");
        }


		
		

	}

}
