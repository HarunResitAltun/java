package day_18_Reading_User_Input;

import java.util.Scanner;

public class Task73_NumberGuessGame {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num;
		int secretNum=13;
		
		do {
			num = sc.nextInt();
			
			if (num<secretNum){
				
				System.out.println("Enter a bigger number");
			
			} else if (num>secretNum) {
				
				System.out.println("Enter a smaller number");
			
			} else {
				
				System.out.println("Congrat, You got it");
			}
			
		}while(num != secretNum);

	}

}
