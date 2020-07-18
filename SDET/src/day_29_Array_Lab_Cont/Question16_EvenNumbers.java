package day_29_Array_Lab_Cont;

public class Question16_EvenNumbers {

	public static void main(String[] args) {
		
		int[] x = {2,1,2,3,7};
		
		System.out.println(even(x));

	}
	public static int even(int[] arr) {
		
		int counter = 0;
		
		for(int value : arr) {
			
			if(value%2==0) {
				
				counter++;
			}
		}
		return counter;
	}
}
