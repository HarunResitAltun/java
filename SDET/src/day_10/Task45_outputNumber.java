package day_10;

import java.util.Scanner;

public class Task45_outputNumber {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter your number:");
		
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		
		Scanner rep = new Scanner(System.in);
		System.out.println("Enter repeate number:");
		
		int repeate = rep.nextInt();
		
		for(int repeate1=1; repeate1<=repeate; repeate1+=1) {
			
			if(num1==num2) {
				System.out.println("Numbers are equal!");
			}else if(num1>num2) {
				System.out.println(num1 + " is largest. ");
			}else {
				System.out.println(num2 + " is largest. ");
			}
		
		}
	
	}

}
