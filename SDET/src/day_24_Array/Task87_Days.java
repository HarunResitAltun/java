package day_24_Array;

import java.util.Scanner;

public class Task87_Days {

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
		
		String[] days = new String[7];
		
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		System.out.println("Enter your day index number: ");
		int index = str.nextInt();
		
		System.out.println("Today is " + days[index]);

	}

}
