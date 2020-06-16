package day_14_Methods_Part2;

public class Lab1_Question4 {

	public static void main(String[] args) {
		
		deerPlay(110, true);

	}
	
	public static void deerPlay(int temp, boolean Summer) {
		
		if(temp>=60 && temp<=90) {
			
			System.out.println(true);
			
		}else if(temp<=100 && Summer) {
			
			System.out.println(true);
			
		}else {
			
			System.out.println(false);
		}
	}

}
