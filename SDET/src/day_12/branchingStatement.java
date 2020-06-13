package day_12;

public class branchingStatement {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			if(i==4) {
			
				break;//the code pass the 4 and 5  due to the result is true and jump to the out of the loop
			
			}
			
			System.out.println(i);
			
		}System.out.println("");
		
		for(int i=1; i<=5; i++) {
			
			if(i==4) {
			
				continue;//the code pass the 4  due to the result is true and did not write 4
			
			}
			
			System.out.println(i);
		}
	}
}


