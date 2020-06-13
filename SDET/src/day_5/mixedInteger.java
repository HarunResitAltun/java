package day_5;

public class mixedInteger {

	public static void main(String[] args) {
		
		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		int res1 = i1+i2;
		float res2 = i1 + f1;
		double res3 = i2 + d1;
		
		short firstNumber=10;
		short secondNumber=20;
		
		int thirdNumber=firstNumber+secondNumber;//when we using variable less than int for calculation; the result will be in int.
		short thirdNumber2=(short)(firstNumber+secondNumber);//casting
		
		byte b1=20;
		byte b2=2;
		
		byte b3=(byte)(b1*b2);
		//or
		int b4=b1+b2;
		
		int e1=20;
		int e2=30;
		
		byte res=(byte)(e1+e2);//You need to use casting due to variables
		byte res34= 20+30; //No casting due to using the number directly

	}

}
