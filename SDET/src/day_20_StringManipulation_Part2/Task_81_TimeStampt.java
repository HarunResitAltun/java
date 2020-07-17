package day_20_StringManipulation_Part2;

public class Task_81_TimeStampt {

	public static void main(String[] args) {
		
		String time = "11/10/2020 13:59:34";
		timeStamp(time);

	}
	
	public static String timeStamp(String time) {
		
		time = time.replace("/", "").replace(" ", "").replace(":", "");
		System.out.println(time);
		
		return time;
	}
	
	

}
