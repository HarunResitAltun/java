package day_13_Methods_Part1;

public class PassMultipleArguments {

	public static void main(String[] args) {
		
		showSum(5,23);
		showSum(12,11);
		showSum(5,11);
		showSum(56,11);

	}
	
	public static void showSum(int num1, int num2) {
		
		System.out.println(num1+num2);
	}

}
