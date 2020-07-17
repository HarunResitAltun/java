package day_28_Array_Lab;

import java.util.Arrays;

public class Question13_SumEqual {

	public static void main(String[] args) {
		
		int[] x = {1,6};
		int[] y = {3,4};
		int[] x1 = {2,6};
		int[] y1 = {3,4};
		int[] x2 = {2,6};
		int[] y2 = {5,4};
		
		sumEqual(x,y);
		sumEqual(x1,y1);
		sumEqual(x2,y2);
		

	}
	public static void sumEqual(int[]arr1, int[]arr2) {
		
		int sum1 =0;
		int sum2 =0;
		
		for(int i=0;i<arr1.length;i++) {
			
			sum1 = sum1 + arr1[i];
		}

		for(int j=0;j<arr2.length;j++) {
			
			sum2 = sum2 + arr2[j];
		}
		
		if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}else if(sum2>sum1){
			System.out.println(Arrays.toString(arr2));	
		}else {
			System.out.println("Equal");
		}
	}

}
