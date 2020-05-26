package day_4;

public class Question6 {

	public static void main(String[] args) {
		

		int gram,drink,overdose;
		gram=10*1000;
		overdose=500;
		drink=gram/overdose;
		
		System.out.println("Number of milligrams in drink: "+overdose);
		System.out.println("It would take about " + drink + " drinks for a lethal overdose");
		
	}

}
