package day_29_Array_Lab_Cont;

public class Question18_Number13 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,13,5,4};
		int[] y = {11,2,13,4,5};
		int[] z = {13,1,2};
		
		System.out.println(number13(x));
		System.out.println(number13(y));
		System.out.println(number13(z));

	}
	public static int number13(int[] arr) {
		
		
		int sum = 0;
		for(int i=0; i<arr.length-1;i++) {
			
			if(arr[i]!=13) {
				
				sum = sum + arr[i];
			
			}else {
				break;
				
			}
		}
		return sum;
	}

}
