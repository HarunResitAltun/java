package day_29_Array_Lab_Cont;

public class Question22_Compare14 {

	public static void main(String[] args) {
		
		int[] x = {1,4,1};
		int[] y = {1,4,1,4};
		int[] z = {1,1};
		
		System.out.println(compare14(x));
		System.out.println(compare14(y));
		System.out.println(compare14(z));

	}
	
	public static boolean compare14(int[]arr) {
		
		int counter1 = 0;
		int counter4 = 0;
		
		/*for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==1) {
				counter1++;
			}else if(arr[i]==4) {
				counter4++;
			}
		}*/
		
		for(int value : arr) {
			
			if(value==1) {
				counter1++;
			}
		}
		
		for(int value : arr) {
			
			if(value==4) {
				counter4++;
			}
		}
		
		if(counter1>counter4) {
			return true;
		}else {
			return false;
		}
	}

}
