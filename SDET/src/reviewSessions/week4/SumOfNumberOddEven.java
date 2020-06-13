package reviewSessions.week4;

import java.util.Scanner;

public class SumOfNumberOddEven {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your start number:");
		
		int num1 = num.nextInt();
		
		Scanner end = new Scanner(System.in);
		System.out.print("Enter your end number:");
		
		int num2 = end.nextInt();
		
		Scanner div = new Scanner(System.in);
		System.out.print("Your number should be divisible by: ");
		
		int dv = div.nextInt();
		
		Scanner eon = new Scanner(System.in);
		System.out.print("You wanna see odd or even numbers? 0-Odd 1-Even: ");
		
		int evenOdd = eon.nextInt();
		
		int oddSum = 0;
		int evenSum = 0;
			
		if(evenOdd==0) {
				
			for(int j=num1; j<=num2; j++) {
					
				if(j%dv==0) {
					
					if(j%2!=0) {
					
						oddSum = oddSum + j;
						//System.out.println(j);
						
					} 
					
				}
				
			} System.out.println(oddSum);
			
		} else if(evenOdd==1) {
			
			for(int k=num1; k<=num2; k++) {
				
				if(k%dv==0) {
					
					if(k%2==0) {
				
						evenSum = evenSum + k;
						//System.out.println(k);
						
					}
					
				}
				
			} System.out.println(evenSum);
			
		}
		
	} 

}


