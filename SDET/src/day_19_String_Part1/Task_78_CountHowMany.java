package day_19_String_Part1;

public class Task_78_CountHowMany {

	public static void main(String[] args) {
		
		String word = "abcabqcabc";
		
		char myChar = 'c';
		int number=0;
		for(int i=0; i<word.length(); i++) {
			
			if(word.charAt(i)==myChar) {
				//number = number+1;
				number++;
			}	
		}
		
		System.out.println("Number of " + myChar +  " in this string is " + number);
	}
}
