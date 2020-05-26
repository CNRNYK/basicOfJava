package day3_variables;

public class primitiveVariables {

	public static void main(String[] args) {
		

		byte b1 = 23;
		byte b2 = -24;
	
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2 + "\n");

		short s1 = -32765;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3 + "\n");
		
		int i1 = -233563;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4 + "\n");
		
		long l1 = 5000;
		long l2 = -15643213632456L; // suffix L is mandatory due to the number is out of range
		long l3 = 43895;
		long credicardNumber = 2345_5678_3456_1234L;
		
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("l3 = " + l3);
		System.out.println("credicardNumber = " + credicardNumber + "\n");
		
		float f1 = 2.1f;


		double d1 = 3.14;

		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1 + "\n");
		
		char c1 = 'A';
		char c2 = 65;//html code
		char c3 = '\u0041';//unicode
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3 + "\n");
		
		boolean status = true;
		boolean status2 = false;
		
		System.out.println("He is right = " + status);
		System.out.println("Can a person at 17 years old drive a car? = " + status2 + "\n");
		
		String name = "Harun";
		System.out.println("My name is = " + name + "\n");
				
	}

}
