package day_28_Array_Lab;

public class Question_4_Sum {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		
		int[] y = {-4,2,0};
		
		int a = sum(x);
		System.out.println(a);
		
		System.out.println(sum(y));

	}
	
	public static int sum(int[] number) {
		
		int sum = 0;
		
		for(int value : number) {
			
			sum = sum + value;
		}
		
		return sum;
	}
	

}
