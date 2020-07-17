package day_28_Array_Lab;

public class Question10_PrintTrueTwiceNumber {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,2};
		int[] y = {3,4,5,6,3};
		int[] z = {2,2};
		int[] a = {3,3};
		int[] b = {1,2,3,4,5};
		
		System.out.println(double23(x));
		System.out.println(double23(y));
		System.out.println(double23(z));
		System.out.println(double23(a));
		System.out.println(double23(b));

	}
	
	public static boolean double23(int[]arr) {
		
			int counter2 = 0;
			int counter3 = 0;
			
			for(int value : arr) {
				
				if(value==2) {
					counter2++;
				}else if(value == 3) {
					counter3++;
				}
			}
			
			if(counter2 == 2 || counter3 == 2) {
				return true;
			}else {
				return false;
			}
	}

}
