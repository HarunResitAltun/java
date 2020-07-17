package day_28_Array_Lab;

import java.util.Arrays;

public class Question11_Changed3To0 {

	public static void main(String[] args) {
		
		int[] x = {1,2,4,5,3};
		int[] y = {1,2,3,4};
		int[] z = {1,2,3};
		
		System.out.println(Arrays.toString(change30(x)));
		System.out.println(Arrays.toString(change30(y)));
		System.out.println(Arrays.toString(change30(z)));

	}
	public static int[] change30(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
			/*if(arr[i]==2) {
				
				if(arr[i+1]==3) {
					arr[i+1]=0;
				}else {
					arr[i+1]=arr[i+1];
				}
			}*/
		}
		return arr;
	}

}
