package assignments.day_0008;

public class task_37_38_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * TASK 37
		 * Write a program that lets user to enter apple,dell,acer laptop models If it is apple show “Apple-no virus”
			If it is dell show “Tough one”
			If it is acer show “Not recommended”
			Else “do not buy that one!”
		 */
		
		
		String model = "Apple";
		
		switch (model) {
		case "Apple":
			System.out.println("Apple-no virus");
			
			break;
			
		case "Dell":
			System.out.println("Tough one");
			break;
			
		case "Acer":
			System.out.println("never mind");

		default:
			System.out.println("do not buy that one");
			break;
		}
		
		
		
		/*
		 * Task 38
		 * Write a program to display days: 
		 * 1-Monday
		 * 2-Tuesday
		 * 3- Wednesday 
		 * 4-Thursday 
		 * 5-Friday 
		 * 6-Saturday
		 * 
		 */
		
		
		int dayCount = 1;
		
		
		switch (dayCount) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not valid input");
			break;
		}
		
		
		/*
		 * TASK 39
		 * Write a program to display traffic light colors using following logic: if code (R/r)-->"Red"
			if code (O/o)-->"Orange" if code (G/g)-->"Green"
		*/
		
		String code = "g";
		switch (code) {
		case "r" : case  "R":
		{
			System.out.println("Red");
			break;
		}
		case "o" : case  "O":
		{
			System.out.println("Orange");
			break;
		}
		case "G" : case  "g":
		{
			System.out.println("Grean");
			break;
		}
		default:
		{
			System.out.println("Wrong input");
		}
		
			
			
		}
		

	}

}
