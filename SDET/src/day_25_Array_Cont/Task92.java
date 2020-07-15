package day_25_Array_Cont;

import java.util.Arrays;

public class Task92 {

	public static void main(String[] args) {
		
		/*int numbers [] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = numbers[i]*19;
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}*/
		
		int[] numbers = new int[10];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = i+1;
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]*19);
		}

		System.out.println(Arrays.toString(numbers));
	}

}
