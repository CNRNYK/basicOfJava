package assignments.day_0008;

public class switch_Case {
	
	public static void main(String[] args) 
	{
		String whether =  "hota";
		
		switch (whether) {
		
		case "sunny":
			System.out.println("Go to park");
			break;
		
		case "hot":
			System.out.println("Go to swimming");
			break;
			
		case "windy": 
			System.out.println("Fly a kite");
			break;
			
		case "snow":
			System.out.println("Go snownboarding");
			break;
			
		default:
			System.out.println("test");
			break;


		}
	}

}
