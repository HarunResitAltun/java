package day_27_Array_Cont_Lab;

public class Lab4_Question3_2Array {

	public static void main(String[] args) {
		
		int [] a = {1,2,3};
		int [] b = {7,3};
		
		//call the method
		System.out.println(commonEnd(a, b));
		
	}
	public static String commonEnd(int[] x , int[] y) {
		
		if(!(x.length>1)) {
			return "Array 1 is not valid";
		}
		if(!(y.length>1)) {
			return "Array 2 is not valid";
		}
		
		if(x[0]==y[0] || x[x.length-1]==y[y.length-1]) {
			return "true";
		}else {
			return "false";
		}
	}

}
