package reviewSessions.week8;

public class Array_Intro {

	public static void main(String[] args) {
		
		//declare int array with size 4
		int[] array = new int[4];
		
		//assing values to each index
		
		array[0]=100;
		array[1]=200;
		array[2]=500;
		array[3]=700;
		// array[4]=-5;//compilation error, runtime error  java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		int x  = array[3];
		
		//we can use int variables for index
		
		int i=0;
		System.out.println(array[i]);
		
		i++;
		System.out.println(array[i]);
		
		System.out.println(array.length);
		
		for(int j=0; j<array.length;j++) {
			System.out.println(array[j]);
		}
		
		//modify index to 222
		array[0]=222;
		System.out.println("Number at index 0: " + array[0]);
		
		//read value from index 1 and store into index 2
		array[2] = array[1];
		System.out.println("Number at index 2: " + array[2]);
		

	}

}
