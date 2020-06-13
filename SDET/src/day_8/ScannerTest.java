package day_8;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		
		int x = scanner.nextInt();
		
		System.out.println("Enter your kids number:");
		
		int y = scanner.nextInt();
		
		int total = x + y;
		
		System.out.println("Total is:" + total);
		

	}

}
