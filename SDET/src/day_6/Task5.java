package day_6;

public class Task5 {

	public static void main(String[] args) {
		
		double d1 = 20;
		double d2 = 80;
		double res = (d1+d2)*25;
		double  res2= res%40;
		boolean res3 = res2<=20;
		
		System.out.println(res2);
		System.out.println(res3);
		System.out.println("Remaining total is equal to 20 or less? - " + (res2<=20));

	}

}
