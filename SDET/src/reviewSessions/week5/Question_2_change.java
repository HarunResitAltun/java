package reviewSessions.week5;

public class Question_2_change {

	public static void main(String[] args) {
		
		changeN(10);
		changeN(35);

	}
	
	public static void changeN(int Num1) {
		
		int price = (100 - Num1);
		
		int quarters = price/25;
		int dimes = (price%25)/10;
		int nickles = ((price%25)%10)/5;

		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + " and " + nickles + " nickles");
	
	}
	

}
