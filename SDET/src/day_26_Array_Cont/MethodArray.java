package day_26_Array_Cont;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {
		
		printArray(13);//this value is assign instead of the print array method int number value.

	}
	
	public static int[] createArray(int arraySize) {//the entered number value call this variable
		
		Random rn = new Random();
		
		int[] myArray = new int[arraySize];//the entered value defined the size of array, number of the variables
										   //We identified the myArray array size  or length as 5.
		for(int i=0; i<myArray.length; i++) {//for loop will run 5 times according to the entered int number.
			
			myArray[i]=rn.nextInt(100);//The code will run 5 times and assign 5 random numbers.
			
		}
		
		return myArray;
		
	}
	
	public static void printArray(int number) {//
		
		for(int value : createArray(number)){ //we want to use the array and we call the previous array that we want to use. 
			System.out.println(value);		  //If you want to the use return method, you need to call the method.
		}									  //we have already return it.
											  //we assign int in to the array due to  the array variable is int.
											  //previous array variables are int and we need to assign int variables in to the array at the for loop.
											  //The assign number calls the creatArray method int arraySize variables.
	}

}
