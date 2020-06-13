package Assignment_5;

import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		
			int i = 0;
			Scanner scanner = new Scanner(System.in);
		
			while(i<100) {
		
				System.out.println("Enter a number:"); 
			
				i = scanner.nextInt()*10;
				
			}
				
			System.out.println("Value is bigger than 100");
		}

	}


