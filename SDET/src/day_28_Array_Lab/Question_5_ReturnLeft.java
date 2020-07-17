package day_28_Array_Lab;

import java.util.Arrays;

public class Question_5_ReturnLeft {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {17,12,10,8};
		int[] z = {7,0,0};
		
		System.out.println(Arrays.toString(left(x)));
		System.out.println(Arrays.toString(left(y)));
		System.out.println(Arrays.toString(left(z)));

	}
	
	public static int[] left(int[] arr) {
		
		int x = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			
			arr[i] = arr[i+1];
			
		}
		
		arr[arr.length-1] = x;
		
		return arr;
	}

}
