package day_18_Reading_User_Input;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide a sentence and I will repeat it:");
		
		//String str = sc.next();
		
		String str2 = sc.nextLine();
		
		System.out.println(str2);
		

	}

}
