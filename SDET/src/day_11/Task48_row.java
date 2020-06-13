package day_11;

public class Task48_row {

public static void main(String[] args) {
		
		int row=7;
		int columns=7;
		
		for(int i=0; i<=row; i++) {
			
			for(int p=0; p<=i; p++) {
				
					System.out.print("*");	
						
					}System.out.println();
				}			
	
		for(int i=1; i<=row; i++) {
		
			for(int p=0; p<=columns; p++) {
			
				if(p>=i)
					System.out.print("*");	
				
				}System.out.println();
			}			
			
		}
}
