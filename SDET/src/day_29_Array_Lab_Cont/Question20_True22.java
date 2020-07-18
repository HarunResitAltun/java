package day_29_Array_Lab_Cont;

public class Question20_True22 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,2};
		int[] y = {3,2,2,4};
		
		//System.out.println(two2(x));
		//System.out.println(two2(y));
		two2(x);
		two2(y);

	}
	
	//public static boolean two2(int[]arr) {
	public static void two2(int[]arr) {
		
		/*for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2 && arr[i+1]==2) {
				return true;
			}
		}
		return false;*/
		
		boolean flag = false;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2 && arr[i+1]==2) {
				flag = true;
				break;
			}
		}
			
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
}
