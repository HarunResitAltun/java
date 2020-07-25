package reviewSessions.week9;

import java.util.ArrayList;

public class ArrayListWriteRead {

	public static void main(String[] args) {
		
		//declare arraylist that can store Integer values
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(10);
		nums.add(20);
		nums.add(21);
		nums.add(-7);
		
		//print the number of values in the arraylist
		System.out.println("number of values:" + nums.size());
		
		//print all values in single line toString method
		System.out.println("All values " + nums.toString());
		
		System.out.println(nums.get(0));
		
		System.out.println(nums.get(2));
		
		for(int n=0;n<nums.size();n++) {
			System.out.println(nums.get(n));
		}
	}
}
