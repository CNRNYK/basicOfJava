package days_tasks.week_001.day_0004_aritmaticOperators;

public class Question5 {

	public static void main(String[] args) {
		

		int inputSeconds,hours,minutes,seconds;
		inputSeconds=86399;
		seconds=inputSeconds%60;
		hours=inputSeconds/3600;
		minutes=(inputSeconds/60)%60;
		
		
		System.out.println("inputSecond is "+inputSeconds);
		System.out.println(hours+" hours, " + minutes + " minutes," + "and " + seconds + " seconds");

	}

}
