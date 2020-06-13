package reviewSessions.week4;

public class ArrowNumber {

	public static void main(String[] args) {
		
		/*  0 
			01 
			012 
			0123 
			01234 
			012345 
			0123456 
			01234567 
			012345678 
			0123456789 
			012345678 
			01234567 
			0123456 
			012345 
			01234 
			0123 
			012 
			01 
			0 
		 	*/
		
		
	for(int i=0; i<=9; i++) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print(j);
				
			}
			
			System.out.println(" ");
		}
		
		for(int k=8; k>=0; k--) {
			
			for(int l=0; l<=k; l++) {
				
				System.out.print(l);
				
			}
			
			System.out.println(" ");
		}
	}

}
