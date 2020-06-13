package day_8;

public class Task31 {

	public static void main(String[] args) {
		// A triangle is valid if the sum of all the three angles is equal to 180 degrees. 
		//Write a program that declares three integers as angles 
		//and check whether a triangle is valid or not.

		int a,b,c;
		a=60;
		b=90;
		c=30;
		
		if((a+b+c)==180) {
			System.out.println("This is a valid triangle");
		}else {
			System.out.println("This is not a valid triangle");
		}
	}

}
