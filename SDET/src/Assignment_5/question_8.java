package Assignment_5;

import java.util.Scanner;

public class question_8 {

	public static void main(String[] args) {
		
		Scanner nm = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = nm.nextInt();
		int i = 0;
		int cal = 0;
		
		while(i<=num) {
			
			cal = cal + i;
			
			i++;
		}

		System.out.println(cal);
	}

}
