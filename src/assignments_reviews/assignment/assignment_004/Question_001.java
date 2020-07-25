package assignments_reviews.assignment.assignment_004;
import java.util.Scanner;

public class Question_001 {

	public static void main(String[] args) {
		/*
		 *      - Underweight<18.5

      			- Normal Weight>=18.5 and <25

      			- Overweight>=25 and <30

      			- Obese>=30
      			
      			BMI = mass / (height * height)
      			
      			1 KG = 2.2 pounds
      			
      			1 Mt = 0.0254 * inc
		 */
		
		double heightMetre , weightKg , BMI ;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your height");
		int heightInch = myObj.nextInt();
		
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Enter your weight");
		int weightPound = myObj2.nextInt();
		
		heightMetre = heightInch * 0.0254;
		weightKg = weightPound / 2.2;
		
		BMI = weightKg / (heightMetre*heightMetre);
		
		System.out.println("Your weight in pounds: " + weightPound + " Your weight in kg: " + weightKg);
		System.out.println("Your height in feet followed by a space then additional inches: " + heightInch + " Your height in feet followed by a space then additional meter: " + heightMetre);
		System.out.println("Your BMI is : " + BMI);
		
		if (BMI < 18.5) {
			System.out.println("Your risk factory is Underweight");
		} else if (BMI >= 18.5 && BMI < 25){
			System.out.println("Your risk factory is Normal Weight");
		}
		else if (BMI >= 25 && BMI < 30){
			System.out.println("Your risk factory is Overweight");
		}
		else if (BMI >= 30){
			System.out.println("Your risk factory is Obese");
		}
	}
}
