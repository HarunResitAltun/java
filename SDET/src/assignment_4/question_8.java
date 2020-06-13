package assignment_4;

import java.util.Scanner;

public class question_8 {

	public static void main(String[] args) {
		
		Scanner pk = new Scanner(System.in);
		System.out.println("Enter the number of packages:");
		
		double pack = pk.nextInt();
		double discount;
		double total;
		if (pack<10) {
			total = (pack * 99);
			System.out.println("Total amount of the purchase is $" + total);
		} else if (pack>=10 && pack<=19) {
			discount = ((pack * 99)/100)*20;
			total = (pack * 99) - discount;
			System.out.println("The amount of discounts is $" + discount);
			System.out.println("Total amount of the purchase after discount is $" + total);
		} else if (pack>=20 && pack<=49) {
			discount = ((pack * 99)/100)*30;
			total = (pack * 99) - discount;
			System.out.println("The amount of discounts is $" + discount);
			System.out.println("Total amount of the purchase after discount is $" + total);
		} else if (pack>=50 && pack<=99) {
			discount = ((pack * 99)/100)*40;
			total = (pack * 99) - discount;
			System.out.println("The amount of discounts is $" + discount);
			System.out.println("Total amount of the purchase after discount is $" + total);
		} else if (pack>=100) {
			discount = ((pack * 99)/100)*50;
			total = (pack * 99) - discount;
			System.out.println("The amount of discounts is $" + discount);
			System.out.println("Total amount of the purchase after discount is $" + total);
		}

	}

}
