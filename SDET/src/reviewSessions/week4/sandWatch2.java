package reviewSessions.week4;

public class sandWatch2 {

	public static void main(String[] args) {
		
		int n=7;
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n; j++) {
				
				System.out.print(j);
				System.out.print(" ");
				
			} if(i<=n) {
				System.out.println(" ");
			} 
			
			for(int k=0; k<i; k++) {
				//if(i==n) {
				//break;
				//System.out.print(" ");
				//}
				System.out.print(" ");
			}
		}
		
		for(int l=n-1; l>=1; l--) {
			
			for(int j=l; j<=n; j++) {
				
				System.out.print(j);
				System.out.print(" ");
				
			} if(l<=n) {
				System.out.println(" ");
				} 
			
			for(int k=2; k<l; k++) {
				System.out.print(" ");
			}
		}
	}
	
}