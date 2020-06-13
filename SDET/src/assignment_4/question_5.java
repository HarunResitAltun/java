package assignment_4;

import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {
		
		Scanner m = new Scanner(System.in);
		System.out.println("Enter a date as mm dd yy:");
		m.close();
		
		int month = m.nextInt();
		int day = m.nextInt();
		int year = m.nextInt();
		int md = day * month;
		
		if (md == year) {
			System.out.println("The date is magic");		
		}else {
			System.out.println("The date is not magic");
		}
	}
}
