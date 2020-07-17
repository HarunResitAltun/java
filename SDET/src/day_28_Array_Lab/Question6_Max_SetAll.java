package day_28_Array_Lab;

import java.util.Arrays;

public class Question6_Max_SetAll {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		
		int[] y = {1,20,23,43,5,0,2,6,7,9};
		
		System.out.println(Arrays.toString(maxEnd(x)));
		System.out.println(Arrays.toString(maxEnd(y)));

	}
	
	public static int[] maxEnd(int[]arr) {
		
		int max = arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i+1]>max) {
				 max=arr[i+1];
			
			}
		
		}
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=max;
		}
		return arr;
		
	}
	
}

