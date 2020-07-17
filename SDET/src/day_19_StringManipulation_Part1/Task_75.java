package day_19_StringManipulation_Part1;

import java.util.Scanner;

public class Task_75 {

	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = str.next();//If you want to use Harun R Altun, you need to use str.nextLine()
		
		System.out.println("Enter your last name:");
		String lastName = str.next();
		
		System.out.println("Total characters in your first name and last name is:" + ((firstName.length()) + lastName.length()));
	}

}
