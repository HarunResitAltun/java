package day_25_Array_Cont;

import java.util.Scanner;

public class RainFall {

	public static void main(String[] args) {
		
		double[] numbers = new double[12];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in the following rainfall for the months ahead: ");
		System.out.println("Month Rainfall (In inches)");
		
		String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0; i<months.length;i++) {
			System.out.print(months[i] + ":");
			numbers[i] = sc.nextDouble();

			
			while(numbers[i]<0){
				System.out.println("Please enter a valid number");
				System.out.println(months[i] + " :");
				numbers[i] = sc.nextDouble();
			}
		}
			
		System.out.println("The sum of all the rain is: " + totalRainfall(numbers) + " inches");
		System.out.println("The average rainfall was: " + averageRainfall(numbers, totalRainfall(numbers)) + " inches");
		System.out.println("The max rain is: " + maxRainfall(numbers) + " inches");
		System.out.println("The min rain is: " + minRainfall(numbers) + " inches");	 
		

	}

	public static double totalRainfall(double[] numbers) {
	
	double sum = 0;
	for(int i=0; i<numbers.length; i++) {
		sum = sum + numbers[i];
	}		
		return sum;		
}

public static double averageRainfall(double[] numbers, double sum) {
	
	
	double average = Math.round((sum/numbers.length) * 1000.0)/1000.0;
	
	return average;
	
}

public static double maxRainfall(double[] numbers) {
	double max = 0;
	for(double inches : numbers) {
		if(max<inches) {
			 max=inches;
		}else {
			 max=max;
		}
	}
	return max;
}

public static double minRainfall(double[] numbers) {
	double min = 0;
	for(double inches : numbers) {
		if(min>inches) {
			 min=inches;
		}else {
			 min=min;
		}
	}
	return min;
}
}
	
	



