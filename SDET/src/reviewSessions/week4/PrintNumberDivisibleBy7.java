package reviewSessions.week4;

public class PrintNumberDivisibleBy7 {

	public static void main(String[] args) {
		
		int start = 3;
		int end = 245;
		
		//Print all numbers between these range divisible by 7
		
		int counter = 0;
		
		for(int i =start ; i<=end ; i++) {
			
			if(i%7==0) {
				
				System.out.println(i);
				counter++;
       			//System.out.println(counter); display the counter after each number
			} 
			//System.out.println(counter); display the counter increasing it after each loop. for example: 
										// 34 34 34 34 34 35
		}
		
		System.out.println(counter);
		
	}
	
}
