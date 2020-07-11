package day_19_String_Part1;

import java.util.Scanner;

public class Task_76 {

	public static void main(String[] args) {
		
		
		/* Method 1
		
		Scanner str = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = str.nextLine();
		
		String name = "Cybertek School";
		
		int n = (name.length()-1);
		
		for(int i=0 ; i<=n; i++) {
			
			System.out.println(name.charAt(i));
			
		}
		
		method 2
		
		String name1 = "Cybertek School";
		
		int n1 = (name1.length()-1);
		
		for(int i=0 ; i<=n; i++) {
			
			System.out.println(name1.charAt(i));
		}*/
		
		//Method 3
		
		String name2 = "Cybertek School";
		
		//for(int i=0 ; i<=name2.length()-1       ; i++) {
		for(int i=0 ; i<name2.length(); i++) {
			
			System.out.println(name2.charAt(i));
		}

	}

}
