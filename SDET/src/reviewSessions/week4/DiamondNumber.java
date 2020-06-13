package reviewSessions.week4;

import java.util.Scanner;

public class DiamondNumber {

	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
		System.out.print("Enter your start number:");
		
		int dm = num.nextInt();
		
		for (int i = 1; i <= dm; i++) {
          
			int n = dm;
 
            for (int j = 1; j <= n - i; j++) {
              
            	System.out.print(" ");
            }
            
            for (int k = i; k >= 1; k--) {
              
            	System.out.print(k);
            }
            
            for (int l = 2; l <= i; l++) {
               
            	System.out.print(l);
            }
 
            System.out.println();
        }
 
        for (int i = dm-1; i >= 1; i--) {
          
        	int n = dm-1;
 
            for (int j = 0; j <= n - i; j++) {
             
            	System.out.print(" ");
            }
           
            for (int k = i; k >= 1; k--) {
                
            	System.out.print(k);
            }
            
            for (int l = 2; l <= i; l++) {
              
            	System.out.print(l);
           
            }
 
            System.out.println();
        }

	}

}
