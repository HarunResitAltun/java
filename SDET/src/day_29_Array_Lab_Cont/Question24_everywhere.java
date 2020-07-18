package day_29_Array_Lab_Cont;

public class Question24_everywhere {

	public static void main(String[] args) {
		
		int[] y = {1,2,1,3};
		int a = 2;
		
		int[] z = {1,2,1,3};
		int b = 1;
		
		System.out.println(every(y,a));
		System.out.println(every(z,b));

	}
	
	public static boolean every(int[] arr, int number) {
		
				
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==number && (arr[i+1]==number || arr[i+2]==number)) {
				
				return true;
			}		
		}
		
		return false;
	}	
}
		



