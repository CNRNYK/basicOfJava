package assignments_reviews.assignment.assignment_004;
import java.util.Scanner;
public class Question_011 {

	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Choose enviroment?");
		String enviroment = myObj.nextLine();
		System.out.println("Entry the distance");
		double distance = myObj.nextDouble();
		// Air , Water , Steel 
		double time = 0;
		switch (enviroment){
			case "Air" :
				time = distance / 1100;
				System.out.println("It's take: " + time + " sec");
				break;
			case "Water":
				time = distance / 4900;
				System.out.println("It's take: " + time + " sec");
				break;
			case "Steel" :
				time = distance / 16400;
				System.out.println("It's take: " + time + " sec");
				break;
			default :  System.out.println("Not valid input");
			
			}
		}

	}


