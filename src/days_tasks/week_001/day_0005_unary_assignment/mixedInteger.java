package days_tasks.week_001.day_0005_unary_assignment;

public class mixedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1 = 5;
		int i2= 10;
		
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1 + i2;
		float res2 = i1+ f1; 
		double res3 = i2 + d1;
		
		short firstNumber = 10;
		short secondNumber = 20;
		
		short thirdNumber =(short)(firstNumber + secondNumber);  // sadece integer ile toplama yapabiliyor ondan dolayı tekrar short'a çevirmemiz gerekti
		
		byte b1 = 20;
		byte b2 = 2;
		
		byte b3 = (byte) (b1*b2); 
		int b4 = b1*b2; 
		
		int c1=20;
		int c2=30;
		byte res = (byte) (c1+c2);
		byte res21 = 100 + 10;

	}

}
