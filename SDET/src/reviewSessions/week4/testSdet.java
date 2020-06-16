package reviewSessions.week4;

public class testSdet {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=7; i++) {
			
			for(int j=1; j<i; j++) {
				
				System.out.print(" ");
				
			} 
			for(int k=i; k<=7; k++) {
				
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for(int i= 2; i<=7; i++) {
			
			for(int j=1; j<=7-i; j++) {
		
				System.out.print(" ");
				
			} 
			
			for(int k=7-i+1; k<=7; k++) {
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}

	}
	
}


