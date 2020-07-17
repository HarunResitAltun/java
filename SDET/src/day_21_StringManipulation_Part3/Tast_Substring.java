package day_21_StringManipulation_Part3;

public class Tast_Substring {

	public static void main(String[] args) {
		
		String s1 = "JavaScript";
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(s1.length()-4));
		System.out.println(s1.substring(3));
		
		String s2 = "Programming is fun";
		
		System.out.println(s2.substring(1,4));
		System.out.println(s2.substring(2,3));
		System.out.println(s2.substring(12,s2.length()-4));
		System.out.println(s2.substring(4,4));
		
		String sentence = "Java String Manipulation is fun";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5,11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5, sentence.length()-5));
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		
		String result = chars.substring(0,2) + word + chars.substring(2);
		System.out.println(result);
		
		System.out.println(word.toLowerCase());
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.toUpperCase());
		
		String trim1 = "    Programming is    fun";
		System.out.println(trim1.trim());//only trim beginning and end
		
		String trim2 = "Programming is fun      ";
		System.out.println(trim2.trim());
		
		String trim3 = "     Programming is fun      ";
		System.out.println(trim3.trim());
		
		String trim4 = "     Programming     is      fun      ";
		System.out.println(trim4.trim());
		
	}

}
