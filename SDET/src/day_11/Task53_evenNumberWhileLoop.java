package day_11;

public class Task53_evenNumberWhileLoop {

	public static void main(String[] args) {
		
		int i=0;
		int sumEven=0;
		
		while(i<100) {
			
			if(i%2==0) {
				
				sumEven = sumEven + i;
			}
			
			i++;
		}
		
		System.out.println(sumEven);
	}
}
