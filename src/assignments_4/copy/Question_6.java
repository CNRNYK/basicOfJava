package assignments_4.copy;
import java.util.Scanner;
public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Weight, Mass;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter mass");
		Mass = myObj.nextDouble();
        Weight = Mass * 9.8;
        if (Weight >= 1000) {
        	System.out.println("Too heavy");
        }else if(Weight <= 10 ) {
        	System.out.println("Too light");
        }


		
		

	}

}
