package day_8;

public class smallTasks2 {

	public static void main(String[] args) {
		
		//Write an if-else statement that assigns 20 to variable y
		//if the variable x is greater than 100. 
		//Otherwise, it should assign 0 to the variable y
		int y,x;
		y=10;
		x=110;
		
		if (x>100) {
			y=20;
			System.out.println("y= " + y);
		}else {
			y=0;
			System.out.println("y= " + y);
		}

		//Write an if-else statement that assigns 1 to x when y is equal to 100. 
		//Otherwise, it should assign 0 to x.
		int y1,x1;
		x1=10;
		y1=100;
		
		if (y1==100) {
			x1=1;
			System.out.println("x= " + x1);
		}else {
			x1=0;
			System.out.println("x= " + x1);
		}
		
		//Write an if-else statement that assigns 0 to the variable b and 
		//assigns 1 to the variable c if the variable a is less than 10. 
		//Otherwise, it should assign –99 to the variable b
		//and assign 0 to the variable c
		int a,b,c;
		a=11;
		b=10;
		c=100;
		
		if (a>10) {
			b=0;
			c=1;
			System.out.println("b= " + b + " c= " + c);
		}else {
			b=-99;
			c=0;
			System.out.println("b= " + b + " c= " + c);
		}
	}

}
