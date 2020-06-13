package reviewSessions.week4;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i>=2 && i<=4) {
				
				System.out.println("Skpping-" + i);
				continue;//we are not executing the following part of the code and skipping it.
						 //continue to execute the code beginning.
				//break; when we use break, it just finish the code and jump out the loop.
			}
			
			System.out.println("i=" + i);
			
		}

	}

}
