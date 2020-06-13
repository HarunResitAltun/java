package day_8;

public class Task32 {

	public static void main(String[] args) {
		// Declare 3 numbers
		//Program should display which one is largest
		
		int num1,num2,num3;
		num1=500;
		num2=555;
		num3=300;
		
		if ((num1>num2) && (num1>num3)) {
			System.out.println("Num1 is greatest one");
		}else if((num2>num1) && (num2>num3)) {
			System.out.println("Num2 is greatest one");
		}else if((num3>num1) && (num3>num2)) {
			System.out.println("Num3 is greatest one");
		}else {
			System.out.println("Numbers are equal");
		}

	}

}
