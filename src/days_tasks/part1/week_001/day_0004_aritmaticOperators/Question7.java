package days_tasks.part1.week_001.day_0004_aritmaticOperators;

public class Question7 {

	public static void main(String[] args) {
		
		int vend,cent,nickle,dime,quarter,dollar;
		vend=23;
		dollar=100-vend;
		nickle=((dollar%25)%10)/5;
		dime=(dollar%25)/10;
		quarter=dollar/25;
		
		System.out.println("Price in cent : "+vend);
		System.out.println("Your change is " + quarter + " quarters," + dime + " dimes, and " + nickle + " nickles");
		
		
		
	}

}
