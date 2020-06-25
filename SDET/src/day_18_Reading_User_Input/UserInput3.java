package day_18_Reading_User_Input;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		System.out.println("Output:" + num1 + ":" + num2 + ":" + str);
		

	}

}
