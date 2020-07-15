package day_25_Array_Cont;

public class ReturnArray {

	public static void main(String[] args) {
		
		double[]value;
		
		value = getArray();
		
		for(double num : value) {
			
			System.out.print(num + " ");
		}
	}
	
	public static double[] getArray() {
		
		double[] array = {1.2,2.3,4.4,5.6};
		
		return array;	
	}
}
