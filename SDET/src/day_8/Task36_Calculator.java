package day_8;

public class Task36_Calculator {

	public static void main(String[] args) {
		
		int num1=46;
		int num2=23;
		
		String operator="*";
		int result=0;
		
		switch(operator) {
		
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
		System.out.println("Result is " + result);
	}

}
