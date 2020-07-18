package reviewSessions.week8;

import java.util.Arrays;

public class Sentence_Split {

	public static void main(String[] args) {
		
		String sentence = "Java is fun";
		
		//find out how many words in the sentence and print
		
		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		String[] words2 = words[0].split("a");
		System.out.println(Arrays.toString(words2));
		
		String result = "About 117,000,000 results (1.33 seconds)";
		String[] googleArray = result.split(" ");
		System.out.println(Arrays.toString(googleArray));
		
		for(String item : googleArray) {
			System.out.println(item);
		}
		
		System.out.println("--------------");
		
		String[] words3 = sentence.split(" ", 1);
		System.out.println(Arrays.toString(words3));
		
		
		
		
	

	}

}
