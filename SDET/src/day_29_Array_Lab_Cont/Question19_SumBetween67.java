package day_29_Array_Lab_Cont;

public class Question19_SumBetween67 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,6,5,4,7,8,9};
		
		System.out.println(sum67(x));

	}
	public static int sum67(int[] arr) {
		
		int sum = 0;
		boolean boolCheckSix = false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(boolCheckSix) {
				
				if(arr[i] == 7) {
					
					boolCheckSix = false;
				}
			
			}else if(arr[i]==6) {
				
				boolCheckSix = true;
				
			}else {
				
				sum = sum + arr[i];
		
			}
		}
		return sum;
	}
	
	
}

