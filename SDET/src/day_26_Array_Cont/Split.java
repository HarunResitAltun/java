package day_26_Array_Cont;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
		String str = "It will display the array of the size";
		
		String[] arr = str.split(" ");
		
		System.out.println(arr.length);
		
		//System.out.println((Arrays.deepToString(arr)));
		
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		
		for(String value : arr) {
			
			System.out.println(value);
		}

	}

}
