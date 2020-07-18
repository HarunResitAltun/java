package reviewSessions.week8;

import java.util.Arrays;

public class To_Char_Array {

	public static void main(String[] args) {
		
		String word = "java";
		char[] letters = word.toCharArray();
		
		System.out.println("Letter length : " + letters.length);
		
		System.out.println(Arrays.toString(letters));
		
		String[] str = {"apple","orange"};
		
		System.out.println(str[0].substring(2));
		
		System.out.println(str[1].substring(1, 4));

	}

}
