package day_7;

public class Task27_hour {

	public static void main(String[] args) {
		
		int hour;
		hour = 11;
		
		if (hour<12) {
			System.out.println("Good Morning");
		}
		if (hour>=12 && hour<15) {
			System.out.println("Good Afternoon");
		}
		if (hour>=15) {
			System.out.println("Good Evening");
		}

	}

}
