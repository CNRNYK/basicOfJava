package assignments_4;
import java.util.Scanner;
public class Question_015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Input number");
		int number= myObj.nextInt();
		
		switch (number) {
		case 0: case 1: case 2: {
			System.out.println("Low number");
			break;
		}
		case 3: case 4: case 5 : {
			System.out.println("Medium number");
			break;
			
		}default : System.out.println("Other number");
		}

	}

}
