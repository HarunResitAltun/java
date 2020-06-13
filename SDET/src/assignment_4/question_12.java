package assignment_4;

import java.util.Scanner;

public class question_12 {

	public static void main(String[] args) {
		
		Scanner sp = new Scanner(System.in);
		System.out.println("Enter the type of your package:");
		String pack = sp.nextLine();
		
		Scanner at = new Scanner(System.in);
		System.out.println("Enter the number of hours that were used:");
		int atime = at.nextInt();
		
		double apack, bpack, cpack;
	
		switch (pack) {
		
		case "A":
		case "a":
			if (atime<=10) {
				apack = 9.95;
			}else {
				apack = 9.95 + ((atime-10)*2);
			}
			System.out.println("Total charge: $" + apack);
			break;
		case "B":
		case "b":
			if (atime<=20) {
				bpack = 13.95;
			}else {
				bpack = 13.95 + ((atime-20)*1);
			}
			System.out.println("Total charge: $" + bpack);
			break;
		case "C":
		case "c":
			cpack = 19.95;
			System.out.println("Total charge: $" + cpack);
			break;
		}
		
	}

}
