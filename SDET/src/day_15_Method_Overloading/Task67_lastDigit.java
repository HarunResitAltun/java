package day_15_Method_Overloading;

public class Task67_lastDigit {

	public static void main(String[] args) {
		
		if(lastDigit(7,17)) {
		
			System.out.println("They have the same last digit");
		
		}else {
		
			System.out.println("They do not have the last digit");
		
		}

	}
	
	public static boolean lastDigit(int num1, int num2) {
		
		if((num1%10)==(num2%10)) {//checking with modulus
		
			return true;
		
		}else {
		
			return false;
		
		}
	}

}
