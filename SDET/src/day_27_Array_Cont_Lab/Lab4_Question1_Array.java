package day_27_Array_Cont_Lab;

public class Lab4_Question1_Array {

	public static void main(String[] args) {
		
		int[] x = {1,2,6};
		int[] y = {6,1,2,3};
		int[] z = {13,6,1,2,3};
		int[] k = {1};
		
		//calling the method
		System.out.println(sixArray(x));
		System.out.println(sixArray(y));
		System.out.println(sixArray(z));
		System.out.println(sixArray(k));

	}
	
	public static boolean sixArray(int[] myArray){//boolean, because result will be true or false
		
		if(myArray.length<1) {
			return false;
		}
		if(myArray[0]==6 || myArray[myArray.length-1]==6) {
			return true;
		}else {
			return false;
		}
	}

}
