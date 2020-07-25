package reviewSessions.week9;

import java.util.Scanner;

public class RainfallTask {

	public static void main(String[] args) {
		
		Rainfall rainfall = new Rainfall();  //creating object from Rainfall class(template)
		Scanner keyboard = new Scanner(System.in);
		
		double[] rain = new double[12];
		
		String months[] = {
				"Jan","Feb","March",
				"April","May","June",
				"July","August","Sep",
				"Oct","Nov","Dev"};
		
		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Month\tRainfall (In inches)");
		
		for(int i=0;i<months.length;i++) {
			System.out.print(months[i] + ":");
			double val = keyboard.nextDouble();  //user will enter the rain amount
			
			while(val<0) {
				System.out.println("Do not enter a negative number. Re enter!");
				val = keyboard.nextDouble(); 
			}
			
			rain[i] = val;			
		}
		
		System.out.println("The sum of the all the rain is" + rainfall.getSum(rain));
		System.out.println("The average rainfall was:" + rainfall.getAverage(rain));
		System.out.println("The max rain is:" + rainfall.getMaxValue(rain));
		System.out.println("The min rain:" + rainfall.getMinValue(rain));	
	}
}