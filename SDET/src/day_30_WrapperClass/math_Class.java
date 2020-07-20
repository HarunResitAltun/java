package day_30_WrapperClass;

public class math_Class {

	public static void main(String[] args) {
		
		double result = Math.pow(4.0, 2.0);
		System.out.println(result);
		
		double result1 = Math.sqrt(5.0);
		System.out.println(result);
		
		final double PI = Math.PI;//at the wirk environment do not use hard code in the code.
								  //keep them in the excel or in different environment and call them there.
		System.out.println(PI);
		
		System.out.println(Math.round(4.6));
		System.out.println(Math.round(4.4));
		
		System.out.println(Math.floor(4.9));//Widening to the less one
		
		System.out.println(Math.ceil(4.2));//completing to the upper value

	}

}
