package day_29_Array_Lab_Cont;

import java.util.Arrays;

public class Question23_PrintingEnteredNumberMinuse {

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(minuse(9)));
		System.out.println(Arrays.toString(minuse(5)));
		System.out.println(Arrays.toString(minuse(1)));

	}
	
	public static int[] minuse(int x) {
		
		int[] array = new int[x];
		
		for(int i=0;i<array.length;i++) {
			
			array[i]=i;
		}
		
		return array;
		
	}

}
