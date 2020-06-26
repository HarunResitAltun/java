package Lab_2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive nonzero integer value:");
		
		System.out.println(sumPos(sc.nextInt()));
		
	}
	private static int sumPos(int num) {
		
		int sum = 0;
		
		for(int i = 1 ; i<=num ; i++) {
			
			sum += i;	
		}
		return sum;
	}
	
	
	

}
