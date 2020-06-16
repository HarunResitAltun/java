package day_14_Methods_Part2;

public class Lab1_Question1 {

	public static void main(String[] args) {
		
		stringTimes("Hello",3);

	}
	
	public static void stringTimes(String word, int repeat) {
		
		//String str = "";
		
		for(int i=0; i<repeat; i++) {
			
			//str = str + word;
			
			System.out.print(word);
		}
		
		//System.out.println(str);
	}

}
