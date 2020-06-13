package day_11;

public class Task48_bigToSmall {

public static void main(String[] args) {
		
		int row=7;
		
		for(int i=1; i<=row; i++) {
		
			for(int p=1; p<=row; p++) {
			
				if(p>=i)
					System.out.print("*");	
				
			}System.out.println();
		}			
	}
}
