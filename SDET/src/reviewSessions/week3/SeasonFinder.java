package reviewSessions.week3;

import java.util.Scanner;

public class SeasonFinder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month:");
		int month = scanner.nextInt();
		
		switch(month) {
		case 3:
			System.out.println("It is spring");
			break;
		case 4:
			System.out.println("It is spring");
			break;
		case 5:
			System.out.println("It is spring");
			break;
		case 6: case 7: case 8://We can group the output in one case line or we can write them separately
			System.out.println("It is summer");
			break;
		case 9: case 10: case 11:
			System.out.println("It is fall");
			break;
		case 12: case 1: case 2:
			System.out.println("It is winter");
			break;
		default:
			System.out.println("Invalid month");
		}
		
	}

}
