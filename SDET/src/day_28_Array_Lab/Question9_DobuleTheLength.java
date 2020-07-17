package day_28_Array_Lab;

import java.util.Arrays;

public class Question9_DobuleTheLength {

	public static void main(String[] args) {
		
		int[] x = {1,2};
		
		System.out.println(Arrays.toString(doLe(x)));

	}
	
	public static int[] doLe(int[] arr) {
		
		int[] newarr = new int[2*arr.length];
		
		newarr[newarr.length-1] = arr[arr.length-1];
		
		return newarr;
		
		
	}

}
