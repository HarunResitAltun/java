package day_19_String_Part1;

public class Task_77_Emoji {

	public static void main(String[] args) {
		
		String emoji = ":op";
		
		if(emoji.length()!= 2) {
			System.out.println("invalid emoji");
			return;//stop the execution
		}/*else if(emoji.charAt(0)==':'){
			
			if(emoji.charAt(1)==')') {
				System.out.println("Smile");
			}else if(emoji.charAt(1)=='(') {
				System.out.println("Sad");
			}else if(emoji.charAt(1)=='/') {
				System.out.println("Upset");
			}else if(emoji.charAt(1)=='p') {
				System.out.println("Playful");
			}else {
				System.out.println("invalid");
			}
			
		}else if(emoji.charAt(0)==';'){
			
			if(emoji.charAt(1)==')') {
				System.out.println("Wink");
			}else if(emoji.charAt(1)=='O') {
				System.out.println("Surprised");
			}else {
				System.out.println("invalid");
			}
		}*/
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first ==':'){
			
			if(second==')') {
				System.out.println("Smile");
			}else if(second=='(') {
				System.out.println("Sad");
			}else if(second=='/') {
				System.out.println("Upset");
			}else if(second=='p') {
				System.out.println("Playful");
			}else {
				System.out.println("Unknown emoji");
			}
			
		}else if(first==';'){
			
			if(second==')') {
				System.out.println("Wink");
			}else if(second=='O') {
				System.out.println("Surprised");
			}else {
				System.out.println("Unknown emoji");
			}
		}
	}
}
