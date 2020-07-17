package day_28_Array_Lab;

import java.util.Arrays;

public class Question7_MergeArrays {

	public static void main(String[] args) {
		
		int[] x = {2,7,1,8,6};
		int[] y = {};
		
		System.out.println(Arrays.toString(merge(x,y)));


	}
	
	public static int[] merge(int[]arr1, int[] arr2) {
		
		arr2 = new int[2];
		
		arr2[0] = arr1[0];
		arr2[1] = arr1[arr1.length-1];
		
		return arr2;
	}
	

}
