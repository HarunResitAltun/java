package Assignment_5;

import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
		
		Scanner nm = new Scanner(System.in);
		System.out.println("Enter a number for Fibonacci series:");
		
		int fibo = nm.nextInt();
		int first = 0;
		int next = 1;
		
		for(int i = 0; i < fibo; i++) {
			
			System.out.print(first);
			
			int add = first;
			
			first = next;
			next = next + add;
			
			if(i + 1 < fibo)
			
				System.out.print(", ");
		}
  
	}
}
