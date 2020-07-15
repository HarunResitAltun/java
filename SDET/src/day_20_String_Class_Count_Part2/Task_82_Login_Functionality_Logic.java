package day_20_String_Class_Count_Part2;

import java.util.Scanner;

public class Task_82_Login_Functionality_Logic {

	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		System.out.println("Please enter your username:");
		String username = str.nextLine();
		System.out.println("Please enter your password:");
		String password = str.nextLine();
		
		String userNameInSystem = "Mike";
		String passwordInSystem = "123";
		
		
		
		if(username.equals("") && password.equals("")) {
			System.out.println("UserName and Password fields can not be empty");	
		}else if(username.equals("") && !password.equals("")){
			System.out.println("UserName can not be empty");	
		}else if(!username.equals("") && password.equals("")) {
			System.out.println("Password can not be empty");	
		}else if(!username.equals(userNameInSystem) || !password.equals(passwordInSystem)) {
			System.out.println("UserName or Password not valid, please verify");	
		}else if(username.equals(userNameInSystem) && password.equals(passwordInSystem)) {
				System.out.println("User Logged in successfully");	
		}
	}
}
