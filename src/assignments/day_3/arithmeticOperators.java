package assignments.day_3;

public class arithmeticOperators {

	public static void main(String[] args) {
		
		// Addition Operator; +
		
		System.out.println(34+26);
		
		int chairs=124;
		System.out.println(chairs+23);
		
		int moreChairs=chairs+5;
		System.out.println(moreChairs);
		
		System.out.println(2+1+"Harun"+(2+1));
	
		int tables=130;
		int total=tables+chairs;
		System.out.println(total);
		
		//Subtraction -
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance=balance-transaction;
		System.out.println(balance);
		
		int linesOfCode=50;
		System.out.println("Lines of code "+linesOfCode); 
		linesOfCode=linesOfCode-2;
		System.out.println("Lines of Code "+linesOfCode);
		
		//Multiplication *
		
		System.out.println(22*2);
		
		int classes=5;
		System.out.println(linesOfCode * classes);
		int totalLinesOfCode=linesOfCode * classes;
		System.out.println("Total Lines of Codes =" + totalLinesOfCode);
		
		//Division /
		
		System.out.println(10/2);
		System.out.println(60/3);
		
		//System.out.println(11/0); throw error while running the code
		
		System.out.println(11*0);
		
		//Modulus, Reminder %
		
		System.out.println(10%2);
		System.out.println(9%2);

	}

}
