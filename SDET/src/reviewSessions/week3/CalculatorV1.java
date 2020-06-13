package reviewSessions.week3;

public class CalculatorV1 {

	public static void main(String[] args) {
		
		double num1 = 10.20;
		double num2 = 5.0;
		char operator = '*';// DO NOT use String due to it is not a primitive variable. We cannot use String 
		//with if(operator == v1)
		
		if(operator == '+') {
			System.out.println(num1 + num2);
		} else if(operator == '-') {
			System.out.println(num1-num2);
		} else if(operator == '*') {
			System.out.println(num1*num2);
		} else if(operator == '/') {
			System.out.println(num1/num2);
		} else {
			System.out.println("Invalid operator");
		}

	}

}
