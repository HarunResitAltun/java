package assignment_4;

import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
		
		Scanner om = new Scanner(System.in);
		System.out.println("Enter the object's mass:");
		
		double mass = om.nextDouble();
		double weight = (mass * 9.8);
		
		if (weight>=1000) {
			System.out.println("Object is too heavy");
		}else if (weight<=10) {
			System.out.println("Object is too light");
		}

	}

}
