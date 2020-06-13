package day_7;

public class Task25_numbers {

	public static void main(String[] args) {
		

		int num1,num2,num3;
		num1=4;
		num2=8;
		num3=1;
		
		if(num1>num2 && num1>num3) {
			System.out.println("Num1 is the greatest");
		}
		if (num2>num1 && num2>num3) {
			System.out.println("Num2 is the greatest");
		}
		if (num3>num1 && num3>num2) {
			System.out.println("Num3 is the greatest");
		}

	}

}
