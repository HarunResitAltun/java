package assignment_4;

import java.util.Scanner;

public class question_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the object's mass:");
		
		double seconds = sc.nextInt();
		int min, hour, day;
		
		if (seconds >= 60 && seconds <3600 ) {
			min = (int)(seconds/60);
			System.out.println("The number of minutes: " + min);
		} else if (seconds >= 3600 && seconds <86400) {
			hour = (int)(seconds/3600);
			System.out.println("The number of hours: " + hour);
		} else if (seconds >= 86400) {
			day = (int)(seconds/86400);
			System.out.println("The number of days: " + day);
		}
	}
}
