package day_10;

public class Task42_evenOddNumbers {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1; i<100; i++) {
			
			if(i%2==0) {		
				
				sumEven = sumEven+i;
				//System.out.println(sumEven);//this code displays one by one the even numbers.
			}else {
				
				sumOdd = sumOdd+i;	
				//System.out.println(sumOdd);//this code displays one by one the odd numbers.
			}
			
			//System.out.println("Sum of even number " + sumEven);//This display the each sum of the numbers.
			//System.out.println("Sum of odd number " + sumOdd);	

		
		}
		System.out.println("Sum of even number " + sumEven);
		System.out.println("Sum of odd number " + sumOdd);	

	}

}
