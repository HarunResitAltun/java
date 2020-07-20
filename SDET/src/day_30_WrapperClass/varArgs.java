package day_30_WrapperClass;

public class varArgs {//variable arguments

	public static void main(String[] args) {
		
		sum(2,4);
		sum(2,3,4,5);
		
		//concat("Apple","Orange","123","Result");
		System.out.println(concat("Apple","Orange","123","Result"));

	}
	
	public static void sum(int... numbers) {//A vararg parameter can take a variable number of argument
		
		int sum = 0;
		
		for(int value : numbers) {
			
			sum = sum +value;
		}
		
		System.out.println(sum);
	}
	
	public static String concat(String... strs) {//accepting elements and converting to the array.
		
		String newStr = "";
		for(String str : strs) {
			
			newStr = newStr + str.charAt(2);
			
		}
		return newStr;
		
		//System.out.println(newStr);
	}
}
