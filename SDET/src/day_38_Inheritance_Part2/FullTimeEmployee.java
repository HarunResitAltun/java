package day_38_Inheritance_Part2;

public class FullTimeEmployee extends Employee {

	@Override
	void calculatePay(int hours, double rate) {
		double total = (hours * rate)*1.05;
		System.out.println("FullTime Emplyee Total Pay:" + total);
	}
}
