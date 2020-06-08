package days_tasks.day_0008;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sign = "/";
		double a = 14;
		double b = 3;
		double c= 3;
		
		
		switch (sign) {
		case "+":
			
			c = a+b;	
			break;
			
		case "-":
			
			c = a-b;
			break;
			
		case "*":
			
			c= a*b;
			break;
			
		case "/":
			
			c= a/b;
			break;

		default:
			break;
		}
		
		System.out.println("Result is= " + c);

	}

}
