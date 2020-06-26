package Lab_2;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		int big;
		int small;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
			
		 big = small = sc.nextInt();
		
		 System.out.println("Enter your next number:");
		
		 big = small = sc.nextInt();
		
		 int nextNum=0;
			
		 do {
			
			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			
			   	int anotherNum = sc.nextInt();
			
			if (anotherNum==1) {
				
				System.out.println("Enter your next number:");
				
				nextNum = sc.nextInt();
				
				if(nextNum<small) {
					small=nextNum;
				}else {
					big=nextNum;
				}
				
			}else if (anotherNum==0){
				
				break;
			
			} else {
				
				System.out.println("Enter a valid number...");
			}

		}while(true);
		
		System.out.println("Smallest Number is:" + small);
		System.out.println("Largest Number is:" + big);
	}

}
