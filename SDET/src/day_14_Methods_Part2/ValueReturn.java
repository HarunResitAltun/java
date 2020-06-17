package day_14_Methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {
		
		//sum();
		
		int x = sum(2,3);
		
		//System.out.println(sum(2,3));
		System.out.println(x);

	}
	
	//public static void sum(int num1, int num2) {
		
	//	int result;//local variable
	//	result = num1 + num2;
		
	//}
	public static int sum(int num1, int num2) { // changing the void to int; to able to move local variable to out side i=of the method
												//You can only return 1 value with a value call method., you can return more value with array
		int result;//local variable
		result = num1 + num2;
		
		return result;//adding return command
					  // when we return the local variable, we make it global and we can use it anywhere we want
		
	}

}
