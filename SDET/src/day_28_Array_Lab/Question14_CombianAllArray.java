package day_28_Array_Lab;

import java.util.Arrays;

public class Question14_CombianAllArray {

	public static void main(String[] args) {
		
		int[] x = {1,2};
		int[] y = {3,4};
		
		int[]contain = new int[x.length + y.length];
		
		for(int i=0;i<x.length;i++) {
			
			contain[i]= x[i];
			
		}
		
		int a = 0;
		for(int j= x.length; j<contain.length;j++) {
			
			contain[j]= y[a];
			a++;
	}
		
		System.out.println(Arrays.toString(contain));
	}

}
