package Assignment_5;

import java.util.Scanner;

public class question_9 {

	public static void main(String[] args) {
		
		Scanner nm = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = nm.nextInt();
		int i = 0;
		
		while(i<=num) {
			
			if(i%2!=0) {
				
				System.out.print(i);
				
				if (i+1 < num) {
					System.out.print(", ");
				}
				
			} i++;
			
		}

	}

}
