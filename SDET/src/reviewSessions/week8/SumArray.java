package reviewSessions.week8;

public class SumArray {

	public static void main(String[] args) {
		
		//loop thru each item and if u find prices more than 100
		//print "item is too expensive"
		//exit the loop
		
		double prices[] = {19.99,230,5.99,102.5};
		
		for(double price : prices){
			
			if(price>100) {//we cannot see the index number on For Each loop.
						   //you need to use iterator loop to see the index number.
				
				System.out.println("item is too expensive");
				break;
			}
		}
		
		//sum of array
		double totalPrice = 0.0;
		
		for(double each : prices) {
			
			totalPrice += each;
			//totalPrice = totalPrice + each;
		}
		System.out.println("Total price is:" + totalPrice);

	}

}
