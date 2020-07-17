package day_28_Array_Lab;

public class Question8_ContainNumber_True {

	public static void main(String[] args) {
		
		int[] x = {2,4,5,3};
		int[] y = {8,4,6,1};
		
		System.out.println(number(x));
		System.out.println(number(y));

	}
	
	public static boolean number(int[] arr) {
		
		for(int value : arr) {
			
			if(value==2 || value==3) {
				
				return true;
			}
		}
		
		return false;
	}

}
