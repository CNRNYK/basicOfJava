package days_tasks.day_0006_logicalOperators;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'A';
		char c2 = 65;
		int i1 =5;
		int i2 =10;
		boolean res1 = (i1==i2) && (c1==c2);
		System.out.println(res1);
		
		boolean res2 = (c1==c2) || (i1==i2);
		System.out.println(res2);
		
		boolean res4 = (c1==c2)^(i1==i2);
		System.out.println(res4);
		
		System.out.println("================");

		int ApplesCount = 20;
		int orrangeCount = 30;
		int PearsCount =30;
		boolean comp = ApplesCount<orrangeCount || orrangeCount>= PearsCount;
		System.out.println(comp);
		
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shinny";
		Degree= 70;
		boolean comp2 = ( !(OutsideWeather=="Rainny" || Degree ==70));
		System.out.println(comp2);
		
		double abc = 20;
		double abd = 80;
		double res = (abc + abd)*25;
		double resa = res%40;
		System.out.println(res + " k " + resa);
		
		float a = 100.987_6543f;
		short b = (byte) a;
		byte c = (byte) b;
		System.out.println(c);
		c = 100 / 2;
		System.out.println(1/2+3/2+0.1);
		
	}

}
