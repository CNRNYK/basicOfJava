package day_4;

public class wages {

	public static void main(String[] args) {
	
		double regularWage; //The calculated wage
		double basePay=25.75; // The base pay
		double regularHours=40; // The hours worked less overtime
		double overtimeWages; // Overt'me wages
		double overTimePay=37.5; //Overtime PAy rate
		double overTimeHours=15;
		double totalWage; //Total Wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overTimePay*overTimeHours;
		
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
		

	}

}
