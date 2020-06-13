package day_10;

public class Task44_speed {

	public static void main(String[] args) {
		
		//Constant
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		
		//Variables
		int kph; //to hold the speed in kph
		double mph; //to hold the speed in mph
		
		 System.out.println("KPH      MPH");
		 System.out.println("--------------");
		
		for(kph=STARTING_KPH; kph<=MAX_KPH; kph+=INCREMENT) { // if you put ";" before the curly brace and after parenthesis
															   // code will only calculate last number after adding 10
															   // 140	86.996
			
			//calculate the mph
			mph=kph*0.6214;
			System.out.println(kph + "\t" + mph);
			
			//Display the speeds in kph and mph
			//System.out.println(kph + "\t" + mph + "\n");// put 1 row space after each data
			//System.out.println("KPH      MPH"); //put this title after each date
			//System.out.println("--------------");//put this title after each date
		 
		}
		System.out.println("\nKPH      MPH");//\n put 1 row space before the title line
											 //if you put it after the title line "KPH    MPH\n"
											 //it will put 1 row space after title line
		System.out.println("--------------");
		
		for(int kph1=60; kph1<=130; kph1+=10) {
			double MPH1 = (double)(kph1 * 0.6214);
			
			System.out.println(kph1 + "\t" + MPH1 );
			
		}

	}

}
