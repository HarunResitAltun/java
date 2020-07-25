package reviewSessions.week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MethodsReturnArrayList {

	public static void main(String[] args) {
		
		System.out.println(getIntList(20));
		System.out.println(getIntList(52));
		System.out.println(getRandomIntList(5));

	}
	
	public static List<Integer> getIntList(int size){
		
		List<Integer> numbers = new ArrayList<>();
	
		for(int n=1;n<=size;n++) {
			numbers.add(n);
		}
		
		return numbers;
	}
	
	public static List<Integer> getRandomIntList(int size){
		
		Random r = new Random();
		List<Integer> numbers = new ArrayList<>();
		
		for(int n=1;n<=size;n++) {
			numbers.add(r.nextInt(101));
		}
		
		return numbers;
	
	}
	

	
	public static int[] myArray(double[] arr) {
		
		int[] x = {1,2,3};
		return x;
	}

}
