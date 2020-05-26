package day_4;

public class contribution {

	public static void main(String[] args) {
		// This program calculate the amount of pay that will be contributed to a retirement
		//plan 'f 5%\ 8%or 10% of monthly pay is withheld
		
		double monthlyPay=1000;
		double contribute=monthlyPay*0.05;
		double contribute2=monthlyPay*0.08;
		double contribute3=monthlyPay*0.1;
		
		System.out.println("5% of monthly pay is $" + contribute + " per month." );
		System.out.println("8% of monthly pay is $" + contribute2 + " per month.");
		System.out.println("10% of monthly pay is $" + contribute3 + " per month." );

	}

}
