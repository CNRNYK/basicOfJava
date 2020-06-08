package days_tasks.day_0005;

public class unaryOparetors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1= +10;
		int i2 = -100;
		int i3 =  -(i1 + i2);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		boolean flag = true;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		int i = 10 , j = 5;
		i++;
		--j;
		System.out.println(i);
		System.out.println(j);  // you should be attention to 
		
		i=10;
		System.out.println(--i + i++ + i-- + i++);
		
		byte b1 =1;
		byte b2 =2;
		double d1= 3.5;
		int i11 = 17;
		float f1 = (float)67.0;
		boolean test1 = (b1==b2);
		System.out.println(test1);
		boolean test2 = (b1<=b2);
		System.out.println(test2);
		boolean test3 = (b1>=b2);
		System.out.println(test3);
	}

}
