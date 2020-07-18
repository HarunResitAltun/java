package reviewSessions.week8;

public class Array_With_Numbers {

	public static void main(String[] args) {
		
		int[] numsArray = new int[5];//runtime we cannot change the size
		numsArray[0] = 123;
		numsArray[1] = 345;
		numsArray[2] = 13;
		numsArray[3] = 10;
		numsArray[4] = numsArray[0] + numsArray[1];
		
		//declare and assign in same statement
		int[] numsArray2 = {123,345,13,10,468};//here, we can change the size of the index before runtime
											   //this is the most practical usage at the work environment.
		
		//declare and assign values in statement using new keyword
		int[] numsArray3 = new int[] {123,345,13,10,468};//we are not going put the size. 
														 //We have already assign the value at the {}
		//print last
		System.out.println(numsArray[numsArray.length-1]);

	}

}
