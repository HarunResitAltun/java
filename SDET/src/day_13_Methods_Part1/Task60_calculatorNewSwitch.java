package day_13_Methods_Part1;

public class Task60_calculatorNewSwitch {

	public static void main(String[] args) {
		
		calculator(6,5,"*");
		calculator(6,5,"+");
		calculator(6,5,"-");
		calculator(15,5,"/");

	}
	
	public static void calculator(int num1, int num2, String operator) {
	
	
		switch(operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Invalid data!!!");
			break;
		}
	}
			
}
	


