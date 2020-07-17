package day_28_Array_Lab;

import java.util.Arrays;

public class Question15_Combain {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(swap(x)));

	}
	public static int[] swap(int[]arr) {
		
		int temp = 0;
		temp = arr[0];
		arr[0]= arr[arr.length-1];
		arr[arr.length-1]= temp;
		
		return arr;
		
	}

}
