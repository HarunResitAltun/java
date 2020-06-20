package reviewSessions.week5;

import java.util.Scanner;

public class Question_3_3Parameters {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		
		int pounds = scanner.nextInt();
		int feet = scanner.nextInt();
		int inches = scanner.nextInt();
		
		bodyConversion(300,10,4);
		

	}
	
	public static void bodyConversion(int pounds, int feet, int inches ) {
		
		double heightMeters = ((feet * 12) + inches) * 0.0254;
		double mass = (pounds/2.2);
		
		double BMI = mass / (heightMeters * heightMeters);
		
		if(BMI<18.5) {
			System.out.println(BMI + ": You risk category is underweight");
		}else if(BMI<25) {
			System.out.println(BMI + ": You risk category is normal weight");
		}else if(BMI<30) {
			System.out.println(BMI + ": You risk category is normal weight");
		}else {
			System.out.println(BMI + ": You risk category is obese");
		}
		
		
		
	}

}
