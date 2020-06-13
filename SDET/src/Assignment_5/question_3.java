package Assignment_5;

public class question_3 {

	public static void main(String[] args) {
		
		int totalEven=0;
		
		for(int i=5; i<=50 ; i++) {
			
			if(i%2==0) {
				
				totalEven = totalEven + 1;
			}	
		}

		System.out.print(totalEven);		
	}
}
