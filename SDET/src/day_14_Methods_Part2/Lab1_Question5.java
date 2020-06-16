package day_14_Methods_Part2;

public class Lab1_Question5 {

	public static void main(String[] args) {
		
		caughtSpeeding(85,true);

	}
	
	public static void caughtSpeeding(int speed, boolean birthday) {
		
		int noTicket = 0;
		int smallTicket = 1;
		int bigTicket = 2;
		
		if(speed<=60) {
			
			System.out.println(noTicket);
			
		}else if(speed>=61 && speed<=80) {
			
			if(speed<=65 && birthday ) {
				
				System.out.println(noTicket);
				
			}else {
				
				System.out.println(smallTicket);
			
			}
		}else if(speed>=81) {
			
			if(speed<=85 && birthday ) {
				
				System.out.println(noTicket);
				
			}else {
				
				System.out.println(bigTicket);
			
			}
		}
		
	}

}
