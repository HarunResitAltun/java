package day_24_Array;

public class Task90_CarName {

	public static void main(String[] args) {
		
		String car [] = {"BMW","Toyota","Nissan","Honda","Mercedes","Porsche"};
		
		boolean flag = false;
		
		for(int i=0; i<car.length;i++) {
			
			if(car[i].equals("Honda")) {
				
				flag=true;
				break;	
			}
		}
		if(flag) {
			System.out.println("I found your car Honda in this array");
		}else {
			System.out.println("I could not find your car Honda in this array");
		}	
	}
}
