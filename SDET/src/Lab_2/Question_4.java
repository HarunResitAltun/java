package Lab_2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of the males in the class: ");
		int male = sc.nextInt();
		System.out.println("Enter number of the females in the class: ");
		int female = sc.nextInt();
		
		percentageOfMf(female, male );
		
	}
	
	public static void percentageOfMf(int female, int male ) {
		
		double percantageOfFemale = 100 * female / (female+male);
		
		System.out.println("Female percantage is " + percantageOfFemale + " percantage of the male is " + (100-percantageOfFemale));
	}
}
