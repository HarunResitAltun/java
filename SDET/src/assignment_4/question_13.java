package assignment_4;

import java.util.Scanner;

public class question_13 {

	public static void main(String[] args) {
		
		Scanner cf = new Scanner(System.in);
		System.out.println("Enter the number of checks:");
		int check = cf.nextInt();
		
		double fee;
		
		if (check<20) {
			fee = 10 + (check*0.1);
			System.out.println("The bank's service fees for the month: $" + fee);
		} else if (check>=20 && check<=39) {
			fee = 10 + (check*0.08);
			System.out.println("The bank's service fees for the month: $" + fee);
		} else if (check>=40 && check<=59) {
			fee = 10 + (check*0.06);
			System.out.println("The bank's service fees for the month: $" + fee);
		} else if (check>=60) {
			fee = 10 + (check*0.04);
			System.out.println("The bank's service fees for the month: $" + fee);
		}

	}

}
