package day_29_Array_Lab_Cont;

public class Question21_SumOfAll2 {

	public static void main(String[] args) {
		
		int[] x = {2,3,2,2,4,2};
		int[] y = {2,3,2,2,4,2,2};
		int[] z = {1,2,3,4};
		
		System.out.println(sum2(x));
		System.out.println(sum2(y));
		System.out.println(sum2(z));

	}
	
	public static boolean sum2(int[] arr) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==2) {
				
				sum = sum + arr[i];
				
			} 	
		}
		
		if(sum==8) {
			return true;
		}else {
			return false;
		}
	}

}
