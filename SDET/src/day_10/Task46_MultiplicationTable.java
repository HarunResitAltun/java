package day_10;

import java.util.Scanner;

public class Task46_MultiplicationTable {

public static void main(String[] args) {
		
		Scanner nm = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		
		int num = nm.nextInt();
		
		
		//int num = 7;
		
		System.out.println("Multiplication table for " + num);
		System.out.println("--------------------------");
		
		for(int i=1; i<=10; i+=1) {
			
			System.out.println(num + "*" + i + "=" + num*i);
				
		}
	
	}

}