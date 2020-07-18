package day_29_Array_Lab_Cont;

import java.util.Arrays;

public class Question29_MultipleOfTen {

	public static void main(String[] args) {
		
		int[] x = {2,10,3,4,20,5,100,1,1,1};
		int[] y = {10,1,20,2};
		
		System.out.println(Arrays.toString(multipleTen(x)));
		System.out.println(Arrays.toString(multipleTen(y)));

	}
	
	public static int[] multipleTen(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%10==0) {
				
				for(int j=i+1;j<arr.length && arr[j]%10 !=0;j++) {
					
					arr[j]=arr[i];
					
				}
			}
		}
	
		return arr;
	}
}
