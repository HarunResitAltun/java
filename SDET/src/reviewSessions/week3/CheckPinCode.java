package reviewSessions.week3;

public class CheckPinCode {

	public static void main(String[] args) {
		

		System.out.println("Welcome to Bank of America");
		
		int secretPinCode = 2345;
		int inputPinCode = 5;
		
		if(inputPinCode==secretPinCode) {
			System.out.println("Welcome to your account!");
		} else {
			
			System.out.println("Invalid Pincode"); 
	
		}	
		System.out.println("Thank you for you business");
	}
}	
	
