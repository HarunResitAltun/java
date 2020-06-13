package assignment_4;

import java.util.Scanner;

public class question_9 {

	public static void main(String[] args) {
		
		Scanner pk = new Scanner(System.in);
		System.out.println("Enter the weight of the package:");
		double pack = pk.nextDouble();
		
		Scanner ml = new Scanner(System.in);
		System.out.println("Enter the shipping miles:");
		double mile = ml.nextDouble();
	
		double charge;
		
		if (pack<=2) {
			charge=(1.1/500)*mile;
			System.out.println("The shipping charge is $" + charge);
		} else if (pack>2 && pack<=6) {
			charge=(2.2/500)*mile;
			System.out.println("The shipping charge is $" + charge);
		} else if (pack>6 && pack<=10) {
			charge=(3.7/500)*mile;
			System.out.println("The shipping charge is $" + charge);
		} else if (pack>10) {
			charge=(3.8/500)*mile;
			System.out.println("The shipping charge is $" + charge);
		}
		
	}

}
