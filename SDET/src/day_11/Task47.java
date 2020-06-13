package day_11;

public class Task47 {

	public static void main(String[] args) {
	
		int row=7;
		int columns=6;
		
		for(int i=1; i<=row; i++) {
			
			for(int p=1; p<=columns; p++) {
				
				System.out.print("*");
				
				//if(p==6) {
				//	System.out.println(" ");
				//}
			}
			
			System.out.println();// if we use "if" statement, we do not need to use this line
		}

	}

}
