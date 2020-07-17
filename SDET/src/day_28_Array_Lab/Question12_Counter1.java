package day_28_Array_Lab;

public class Question12_Counter1 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,5};
		
		System.out.println(counter12(x,y));


	}
	public static int counter12(int[]arr1, int[]arr2) {
		
		int counter = 0;
			
		if(arr1[0]==1) {
			counter++;
		
		if(arr2[0]==1){
			counter++;
		}			
	}
		return counter;
	}
}
