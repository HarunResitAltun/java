package day_18_Reading_User_Input;

import java.util.Scanner;

public class Task74_SumNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum=0;
		
		do {
			
			System.out.println("Enter a number:");
			num = sc.nextInt();
			
			if(num<0) {
				break;
				
			} else {
				
				sum = sum + num;
			}
			
		}while (true);
		
		System.out.println("Total is:" + sum);
		
	}

}
