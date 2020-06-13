package assignment_4;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		
		double BMI, mass, height, feetInch, weight;
		int feet, inch;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight:");

		weight = scanner.nextInt();
		mass = weight;
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter your height:");
		
		height = scanner1.nextInt();
		feetInch=height;
		
		//Converting centimeter to meter
		height = height/100;
		
		//BMI
		BMI = mass / (height * height);
		
		mass = weight * 2.2;
		System.out.println("Your weight in pound: " + mass);
		
		feetInch = feetInch * 0.0254; 
		feet = (int)feetInch/1; 
		inch = (int)((feetInch*10)%10); 
		
		System.out.println("Your height in feet followed by a space then additional inches: " + feet + " " + inch);
	
		System.out.println("Your BMI is: " + BMI);
		
		if (BMI<18.5) {
			System.out.println("Your risk factory is Underweight");
		}else if (BMI>=18.5 && BMI<=25) {
			System.out.println("Your risk factory is Normal Weight");
		}else if (BMI>=25 && BMI<30) {
			System.out.println("Your risk factory is Overweight");
		}else if (BMI>=30) {
			System.out.println("Your risk factory is Obese");
		}
		
	}

}
