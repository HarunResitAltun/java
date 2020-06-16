package day_13_Methods_Part1;

public class findGreater {

	public static void main(String[] args) {
		
		findGreater();

	}
	
	public static void findGreater() {
		
		int num1=55;
		int num2=55;
		
		if(num1>num2) {
			
			System.out.println(num1 + " is greater than " + num2);
		
		}else if(num2>num1){
			
			System.out.println(num2 + " is greater than " + num1);
		
		}else {
			
			System.out.println("Numbers are equal");
		}
	}
}
