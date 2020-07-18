package day_29_Array_Lab_Cont;

public class Question17_DifferenceLargestSmallest {

	public static void main(String[] args) {
		
		int[] x = {10,5,2,13,8,4};
		
		System.out.println(difference(x));

	}
	public static int difference(int[]arr) {
		
		//finding max number
		int max = 0;
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}
		
		//finding min number
		int min = max;
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
			}
		}
		
		return max-min;
	}

}
