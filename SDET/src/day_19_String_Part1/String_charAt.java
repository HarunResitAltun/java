package day_19_String_Part1;

import java.util.Scanner;

public class String_charAt {

	public static void main(String[] args) {
		
		String word = "Computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8)); //If you put out of index number what king of error message is  is gonna give you? 
											  // java.lang.StringIndexOutOfBoundsException: String index out of range: 8
		
		//Check if first character is 'A'
		String word2 = "Apple";
		
		if(word2.charAt(0)=='A') {
			System.out.println("A is the first character");
		}else
			System.out.println("A is not the first character");
		
		
		//Check if first and last characters are same
		String word3 = "civic";
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		//if(word3.charAt(0)==word3.charAt(4)) {
		if(first==last) {
			System.out.println("The first character and the last character are same");
		}else {
			System.out.println("The first character and the last character are not same");
		}
			
		
		//last index not hard coded
		
		/*Scanner str = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String word4 = str.next();
		
		int lst = word4.length();
		char firstn = word4.charAt(0);
		char lastn = word4.charAt((lst-1));
		
		if(firstn==lastn) {
			System.out.println("The first character and the last character are same");
		}else {
			System.out.println("The first character and the last character are not same");
		}*/
		
		String word4 = "Java";
		
		char lastChar = word4.charAt(word4.length()-1);
		
		System.out.println("Last char of " + word4 + " is " + lastChar);
		
	}

}
