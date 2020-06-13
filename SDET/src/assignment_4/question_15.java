package assignment_4;

import java.util.Scanner;

public class question_15 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number:");
		String number = num.nextLine();
		
    switch(number) {
		
		case "0":
		case "1":
		case "2":
			System.out.println("Low Number");
			break;
		case "3":
		case "4":
		case "5":
			System.out.println("Medium Number");
			break;
		default:
			System.out.println("Other Number");
		}
	}
}
