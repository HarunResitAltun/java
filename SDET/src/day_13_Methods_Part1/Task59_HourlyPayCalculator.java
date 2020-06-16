package day_13_Methods_Part1;

public class Task59_HourlyPayCalculator {

	public static void main(String[] args) {
		
		hourlyPayCalculator(12, 30);

	}
	
	public static void hourlyPayCalculator(double hours, double hourlyPay) {
		
		double pay = hours * hourlyPay;
		System.out.println(pay);
		System.out.println("Total payment is $" + hours*hourlyPay);
	}

}
