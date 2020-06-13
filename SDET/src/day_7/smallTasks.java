package day_7;

public class smallTasks {

	public static void main(String[] args) {
		
		//Write an if statement that assigns 5 to x when 
		//y is equal to 20
		int x,y;
		x=10;
		y=20;
		
		if(y==20) {
			x=5;
			
			System.out.println("x = "+ x + " y = " + y);
		}
		
		//Write an if statement that multiplies pay rate by 1.5 
		//if hours is greater than 40
		int hours=40;
		double payRate=1000;
		
		if(hours>=40) {
			payRate=1.5*payRate;
			System.out.println("Payrate is= " + payRate);
		}

		//Write an if statement that sets the variable fees to 50 
		//if the Boolean variable max is true
		int fee=20;
		boolean max = true;
		
		if(max==true) {
			fee=50;
			System.out.println("Fee is = " + fee);
		}
		
		//Write an if statement that assigns 20 to the variable a if variable b is 50 
		//and c is greater and equal to 100
		int a,b,c;
		a=10;
		b=50;
		c=100;
		
		if(b==50 && c>=101) {
			
			a=20;
			
		}
		System.out.println("a= " + a);
		
		//Write an if statement that prints Ideal Temp if the temp is between 70 and 80
		int temp=75;
		
		if (temp>=70 && temp<=80) {
			
			System.out.println("Ideal Temp");
		}
		
	}

}
