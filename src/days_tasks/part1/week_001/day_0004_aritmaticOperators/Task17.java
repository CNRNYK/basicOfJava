package days_tasks.part1.week_001.day_0004_aritmaticOperators;

public class Task17 {

	public static void main(String[] args) {
		
		double a,b,c,average;
		a=12;
		b=9;
		c=6;
		
		average=(a+b+c)/3;
		
		System.out.println("Average of 3 numbers is " + average);
		
		
		int pies=10,people=4;
		double piesPerson;
		piesPerson=(double)pies/people;
		
		System.out.println(piesPerson);
		
		piesPerson=pies/(double)people;
		
		System.out.println(piesPerson);
		
		piesPerson=(double)(pies/people);
		
		System.out.println(piesPerson);
		

	}

}
