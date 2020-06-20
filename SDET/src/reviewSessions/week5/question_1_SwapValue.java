package reviewSessions.week5;

public class question_1_SwapValue {

	public static void main(String[] args) {
		
		
		SwapNumbers(30,10);
		
	}
	
	public static void SwapNumbers(int Num1, int Num2) {
		
		Num2 = Num1 + Num2; //10 + 20 = 30
		Num1 = Num2 - Num1; //30 - 10 = 20
		Num2 = Num2 - Num1; //30 - 20 = 10
		
		//int Num3;
		//Num3 = Num1;
		//Num1 = Num2;
		//Num2 = Num3;
		
		System.out.println("Num1= " + Num1);
		System.out.println("Num2= " + Num2);
		
		
	}

}
