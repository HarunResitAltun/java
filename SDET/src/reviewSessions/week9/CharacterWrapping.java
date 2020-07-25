package reviewSessions.week9;

public class CharacterWrapping {

	public static void main(String[] args) {
		
		char ch = 'a';
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.isAlphabetic(ch));
		
		char ch2 = '5';
		System.out.println(Character.isDigit(ch2));
		System.out.println(Character.isLetterOrDigit(ch2));
		System.out.println(Character.isLetter(ch2));
		
		char ch3 = ' ';
		System.out.println(Character.isWhitespace(ch3));
		System.out.println(Character.isSpaceChar(ch3));
		

	}

}
