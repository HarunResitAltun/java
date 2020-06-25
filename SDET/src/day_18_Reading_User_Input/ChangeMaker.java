package day_18_Reading_User_Input;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
		//Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of
		//change
		
		//quarter: 25 cents
		//dimes: 10 cents
		//nickles: 5 cents
		//pennies: 1 cent 
		
		/*Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a number from 1-99:");
			int attempt=0;
			
			do {
				
				int user_amount=keyboard.nextInt();
				
				if(user_amount>1 && user_amount<100) {
					changeMaker(user_amount);
					break;
				}else {
					attempt++;
					if(attempt==3) {
						System.out.println("Sorry, no more attempt");
						break;
					}else {
						System.out.print("Try again");
					}
				}
				
			}while(true); */
		
		for(int i = 0; i<=2 ; i++) {
			
			Scanner coin = new Scanner(System.in);
			
			System.out.println("Enter a number from 1-99");
			int user_cent = coin.nextInt();
				
			if(user_cent>=1 && user_cent<=99) {
			
				chng(user_cent);
				break;
			
			} else if(i<2) {
			
				System.out.println("Try again...");
				//System.out.println(" ");
		
			}else {
			
			//System.out.println(" ");
			System.out.println("You've already tried 3 times. I am not giving anymore. It is invalid data...");
			
			}
		}
		
	}
	
	public static void chng(int cent) {
		
		int quarter = cent/25;
		//cent = cent%25;
		//int dimes = cent/10;
		int dimes = (cent%25)/10;
		//cent = cent%10;
		//int nickles = cent/5;
		int nickles = ((cent%25)%10)/5;
		//cent = cent%5;
		//int pennies = cent;
		int pennies = (((cent%25)%10)%5);
		
		System.out.println(cent + " is " + quarter + " quarter " + dimes + " dimes " + nickles + " nickles " + pennies + " pennies.");
	
	}

}
