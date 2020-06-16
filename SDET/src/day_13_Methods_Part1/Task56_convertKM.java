package day_13_Methods_Part1;

public class Task56_convertKM {

	public static void main(String[] args) {
		
		//Write  a method that will convert Miles into KMs;
		convertKM();

	}
	
	public static void convertKM() {
		
		int mile=100;
		double km=mile*1.60934;
		
		
		
		System.out.println(mile + " miles = " + km + " km");
	}

}
