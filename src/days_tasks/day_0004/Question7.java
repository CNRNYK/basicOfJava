package days_tasks.day_0004;

public class Question7 {

	public static void main(String[] args) {
		
		int vend,cent,nickle,dime,quarter,dollar;
		vend=95;
		dollar=100-vend;
		nickle=((dollar%25)%10)/5;
		dime=(dollar%25)/10;
		quarter=dollar/25;
		
		System.out.println("Price in cent : "+vend);
		System.out.println("Your change is " + quarter + " quarters," + dime + " dimes, and " + nickle + " nickles");
		
		
		
	}

}
