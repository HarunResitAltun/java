package day_24_Array;

import java.util.Scanner;

public class Task86_Month {

	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		
		String[] months = new String[12];
		
		months[0]="January";
		months[1]="February";
		months[2]="March";
		months[3]="Appril";
		months[4]="May";
		months[5]="June";
		months[6]="July";
		months[7]="August";
		months[8]="September";
		months[9]="October";
		months[10]="November";
		months[11]="December";
		
		System.out.println("Enter your month index number: ");
		int index = str.nextInt();
		
		System.out.println("The month is " + months[index]);
		

	}

}
