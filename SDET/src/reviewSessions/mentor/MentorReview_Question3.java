package reviewSessions.mentor;

import java.util.Scanner;

public class MentorReview_Question3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		
		String reversed = "";
		
		String[] arrsent = sentence.split(" ");
		for(int i=arrsent.length-1;i>=0;i--) {
			reversed += arrsent[i] + " ";
		}
		System.out.println(reversed.trim());
	}
}
