package day_13_Methods_Part1;

public class PassArg {

	public static void main(String[] args) {
		
		int x = 10;
		
		displayValue(12);
		
		displayValue(x);
		
		displayValue(x*4);

	}
	
	public static void displayValue(int num) { //parameter name has to be exactly the same with inside the method
											   //this is method with argument
		
		System.out.println("The value is " + num);
	}
	
	public static void displayValue() { //we can use the same method name for different process.
										//here this is only a method
		
		System.out.println("10");
	}
}
