package day_19_StringManipulation_Part1;

public class Task_79_PrintingVovelComma {

	public static void main(String[] args) {
		
		String word = "CybertekSchool";
		
		System.out.print("Output:");
		
		for(int i=0; i<word.length(); i++) {
			
			char vowel = word.charAt(i);
			
			if(vowel == 'a' || vowel == 'e' || vowel == 'o' || vowel == 'i' || vowel == 'u'){
			
				System.out.print(vowel);
					
				if(i!=word.length()-2) {
				
					System.out.print(",");
				}	
			}	
		}
	}
}
