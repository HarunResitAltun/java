package assignment_4;

import java.util.Scanner;

public class question_10 {

	public static void main(String[] args) {

		Scanner cl = new Scanner(System.in);
		System.out.println("Enter the number of calories:");
		double calories = cl.nextDouble();
		
		Scanner ft = new Scanner(System.in);
		System.out.println("Enter the fat grams:");
		int fat = ft.nextInt();
	
		int fatCalories = fat * 9;
		int perFat = (int)(100*(fatCalories/calories));
		
		if (perFat<30) {
			System.out.println("The percentage of calories that come from fat is %" + perFat);
			System.out.println("The food is low in fat.");
		} else if (perFat>=30 && perFat<100) {
			System.out.println("The percentage of calories that come from fat is %" + perFat);
		} else if (fatCalories>calories) {
			System.out.println("The input is invalid.");
		}

	}

}
