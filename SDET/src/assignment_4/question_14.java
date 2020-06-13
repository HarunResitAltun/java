package assignment_4;

import java.util.Scanner;

public class question_14 {

	public static void main(String[] args) {
		Scanner bk = new Scanner(System.in);
		System.out.println("Enter the number of checks:");
		int book = bk.nextInt();
		
		int pointAwarded;
		
		if (book==0) {
			pointAwarded = 0;
			System.out.println("Points Awarded is " + pointAwarded);
		} else if (book==1) {
			pointAwarded = 5;
			System.out.println("Points Awarded is " + pointAwarded);
		} else if (book==2) {
			pointAwarded = 15;
			System.out.println("Points Awarded is " + pointAwarded);
		} else if (book==3) {
			pointAwarded = 30;
			System.out.println("Points Awarded is " + pointAwarded);
		} else if (book>=4) {
			pointAwarded = 60;
			System.out.println("Points Awarded is " + pointAwarded);
		}
	}
}
