package assignment_4;

import java.util.Scanner;

public class question_11 {

	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);
		System.out.println("Enter the type of element:");
		String medium = m.nextLine();
		
		Scanner dt = new Scanner(System.in);
		System.out.println("Enter the distance:");
		int distance = dt.nextInt();
		int time;
		
    switch(medium) {
		
		case "Air":
		case "air":
		case "AIR":
			time = distance / 1100;
			System.out.println("Travel time is " + time);
			break;
		case "Water":
		case "water":
		case "WATER":
			time = distance / 4900;
			System.out.println("Travel time is " + time);
			break;
		case "Steel":
		case "steel":
		case "STEEL":
			time = distance / 16400;
			System.out.println("Travel time is " + time);
			break;
		default:

		}
	}
}
