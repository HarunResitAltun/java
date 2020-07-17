package day_27_Array_Cont_Lab;

public class Lab4_Question2_checking_Element {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		
		//call the method
		System.out.println(elementArray(x));
		System.out.println(elementArray(y));
		System.out.println(elementArray(z));
		System.out.println(elementArray(k));
		
	}
	
	public static String elementArray(int[]first) {
		
		if(!(first.length>1) ){
			return "Not a valid array";	
		}
		if(first[0]==first[first.length-1]) {
				return "true";
			}else {
				return "false";
			}
		
		}
		
	}
	


