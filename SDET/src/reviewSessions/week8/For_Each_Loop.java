package reviewSessions.week8;

public class For_Each_Loop {

	public static void main(String[] args) {
		
		int[] nums = {5,6,11,725,90};
		
		double prices[] = {19.99,23.5,5.99,102.5};
		
		for(int itDoesNotMatter : nums) { //For Each loops only use with collections. It is easy way.
								          //array, ... iterator loop need to have start and end point.
			
			System.out.println(itDoesNotMatter); //if we need to know specific index number, we cannot use each loop.
		}
		
		for(double price : prices) {
			System.out.println(price);
		}

	}

}
