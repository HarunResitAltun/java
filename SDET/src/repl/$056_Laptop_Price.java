package repl;

import java.util.*;

public class $056_Laptop_Price {
  public static void main(String[] args) {
   double price = 0;
		String storageType, screenType, cpu;
		int ram = 0 ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select screen size:");
		screenType = scan.nextLine();
			
			if (screenType.equals("13.3")) {
				price=price+200;
			}
			if (screenType.equals("15")) {
				price=price+300;
			}
			if (screenType.equals("17.3")) {
				price=price+400;
			}
		
		System.out.println("Select CPU type:");	
		cpu=scan.nextLine();
		
			if(cpu.equals("i3")) {
				price=price+150;
			}
			if(cpu.equals("i5")) {
				price=price+250;
			}
			if(cpu.equals("i7")) {
				price=price+350;
			}
		
		System.out.println("Select RAM size:");
		
		ram=scan.nextInt();
		price=price+(ram/4)*50;
		scan.nextLine();
		
		System.out.println("Select storage type:");
		storageType = scan.nextLine();
		
		System.out.println("Enter memory size:");
		
		int memorySize= scan.nextInt();
		scan.nextLine();
		
			if(storageType.equals("HDD")) {
				price=price+(memorySize/500)*50;
			}
			if(storageType.equals("SSD")) {
				price=price+(memorySize/500)*100;
			}
		
		System.out.println("Enter screen resolution:");
		String screenRes=scan.nextLine();
	
			if(screenRes.equals("FULLHD")) {
				price=price+100;
			}
			if(screenRes.equals("4K")) {
				price=price+200;
			}
		
		System.out.println("Laptop price is: $" + price);
    
  }
}