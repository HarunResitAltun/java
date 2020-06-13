package reviewSessions.week4;

public class Alphabet2 {

	public static void main(String[] args) {
		
		char myLetter = 'A';
		String alphabet = "";
		
		while(myLetter<='Z') {
			
			alphabet += myLetter;
			
			System.out.println(alphabet);
			
			myLetter++;
			
			
		} System.out.println(" ");
		
		for(char letter = 'A' ; letter<='Z'; letter++) {
			
			for(char letter2 = 'A'; letter2<=letter; letter2++) {
				
				System.out.print(letter2);
			}
			
			System.out.println(" ");
		}

	}

}
