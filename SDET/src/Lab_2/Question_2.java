package Lab_2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		Scanner cooky = new Scanner(System.in);
		
		System.out.println("Enter the number of cookies that you ate: ");
			
		int cookies = cooky.nextInt();
		int cal = 300/4;
		int cookcal = cookies * cal;
		
		System.out.println("The number of total calories consumed: " + cookcal);
		

	}

}
