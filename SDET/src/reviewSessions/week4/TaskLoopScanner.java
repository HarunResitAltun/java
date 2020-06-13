package reviewSessions.week4;

import java.util.Scanner;

public class TaskLoopScanner {

	public static void main(String[] args) {
		
		//add scanner

		//ask user to enter the startpoint and endpoint(ex 34 350)
		//ask user to enter:
			//your number should be divisible by : 3
			//you wanna see odd or even numbers? (ex 0-odd, 1-even)
		//show sum 



		//enter start point: 35
		//enter end point : 350
		//you number should be divisible by : 3
		//you want to see odd or even numbers: 1


		//sum of numbers are ......  
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Enter your start point:");
				int start = scanner.nextInt();
				
				System.out.print("Enter your end point:");
				int end = scanner.nextInt();
				
				System.out.print("Your number should be divisible by:");
				int divisible = scanner.nextInt();

				System.out.print("For odd numbers enter 0 , for even numbers enter 1:");
				int oddEven = scanner.nextInt();
				
				int sum = 0;
				
				for(int i=start;i<=end;i++) {
					
					//filter - divisible by
					if(i%divisible==0) {
						
						//another filter -  0 or 1
						if(oddEven==0) {
							
							//filter to see odd numbers
							if(i%2!=0) {
								sum = sum + i;
							}
							
						}else {
							
							//filter to see even numbers
							if(i%2==0) {
								
								sum = sum + i;
							}
							
						}
					}
					
				}
				
				System.out.println("Your total is:" + sum);
		}
}

