package assignments_reviews.assignment.assignment_004;
import java.util.Scanner;
public class Question_010 {
	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input fat grams");
		int fatGrams = myObj.nextInt();
		System.out.println("Please input total calories");
		int totalCalories = myObj.nextInt();
		int fatCalories = fatGrams*9;
		
		
		if ( totalCalories*0.3 > fatCalories){
			System.out.println("The food is low in fat.");
			System.out.println("Percantage of your food %" + 100*fatCalories/totalCalories);
		}
		else if(fatCalories<totalCalories) {
			System.out.println("Percantage of your food %" + 100*fatCalories/totalCalories);
		}
		else if(fatCalories>totalCalories) {
			System.out.println("The input is invalid.");
		}
		
		
		
			
		
	}

}
