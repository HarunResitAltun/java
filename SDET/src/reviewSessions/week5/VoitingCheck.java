package reviewSessions.week5;

public class VoitingCheck {

	public static void main(String[] args) {
		
		checkIfCanVote(35);
		checkIfCanVote(17);
		
		int age2 = 2020 - 2003;
		
		checkIfCanVote(age2);
		birthAge(2000);

	}
	
	public static void checkIfCanVote(int age) {
		
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("You are not eligible to vote");
		}
	}
	
	public static void birthAge(int birthday) {
		
		int age = 2020 - birthday;
		
		System.out.println("birthyear:" + birthday + ". Age " + age);
	}

}
