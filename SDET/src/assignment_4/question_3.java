package assignment_4;

import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = scanner.nextInt();
		scanner.close();
		if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)){
			System.out.println(year + " Leap Year" );
		}else {
			System.out.println(year + " NOT a Leap Year" );
		}
		
	}

}
