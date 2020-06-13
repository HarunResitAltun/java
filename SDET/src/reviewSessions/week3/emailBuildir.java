package reviewSessions.week3;

import java.util.Scanner;

public class emailBuildir {

	public static void main(String[] args) {
		
		Scanner nm = new Scanner(System.in);
		
		System.out.println("Welcome to your new Company!");
		
		System.out.println("Enter your first name, last name, company name:");

		String name = nm.nextLine();
		
		String lastName = nm.nextLine();
		
		String companyName = nm.nextLine();
		
		String email = name + "_" + lastName + "@" + companyName + ".com";
		
		System.out.println("Your email: " + email);	
	}
}
