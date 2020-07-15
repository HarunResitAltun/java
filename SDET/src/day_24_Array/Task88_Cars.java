package day_24_Array;

import java.util.*;

public class Task88_Cars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int price = 0;
		
		String car [] = new String[7];
		
		car[0]= "Honda";
		car[1]= "Toyota";
		car[2]= "Nissan";
		car[3]= "BMW";
		car[4]= "Mercedes";
		car[5]= "Porsche";
		car[6]= "Ferrari";
		
		System.out.println("Please enter an index number to choose your dream car:");
		int carIndex = sc.nextInt();
		
		String selectedCar = car[carIndex];
		
		switch(selectedCar) {
		case "Honda": case "Toyota": case"Nissan":
			price = rn.nextInt((40000 - 20000)+1) + 20000;
			break;
		case "BMw": case "Mercedes": 
			price = rn.nextInt((80000 - 50000)+1) + 50000;
			break;
		case "Porsche": case "Ferrari": 
			price = rn.nextInt((80000 - 50000)+1) + 50000;
			break;
		default:
			System.out.println("Invalid car");
		}
		
		System.out.println("Price for selected car is " + price);
	}
}
