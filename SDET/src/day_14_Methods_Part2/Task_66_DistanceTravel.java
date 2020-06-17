package day_14_Methods_Part2;

public class Task_66_DistanceTravel {

	public static void main(String[] args) {
		
		double dd = distance(40,5);//new assignment name can be anything
		
		System.out.println(dd);
		
		if(dd>500) {
			
			System.out.println("you spent too much gas");
		
		}else {
			
			System.out.println("you spent ok gas");
		
		}

	}
	
	public static double distance(double speed, int time) {
		
		double distanceTravel = speed  * time;
		
		return distanceTravel;
	}

}
