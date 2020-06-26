package Lab_2;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		
		final double TAX = 0.0675;
		final double TIPS = 0.2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What about your meal charge: ");
		
		double charge = sc.nextDouble();
		double tax = calculateTax(charge, TAX);
		double totalBill = charge + tax;
		double tips = calculateTips(totalBill, TIPS);
		
		totalBill += tips;
		
		System.out.println("Meal " + charge + " tax " + tax + " tips " + tips + " total " + totalBill);
	
	}
	
	
	
	public static double calculateTax(double charge, double tax) {
		
		return charge * tax;
	}
	
	public static double calculateTips(double charge, double tips) {
		
		return charge * tips;

	}

}
