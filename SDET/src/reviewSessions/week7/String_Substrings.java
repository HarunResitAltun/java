package reviewSessions.week7;

public class String_Substrings {

	public static void main(String[] args) {
		
		String word = "java is fun";
		
		System.out.println(word.substring(5));
		
		System.out.println(word.substring(0,5));
		
		System.out.println(word.substring(5,7));
		
		System.out.println(word.substring(3,3));
		
		//how to get a particular substring
		
		String s1 = "the best Java Core course in Europe is Cybertek.";
		String myTarget = "Europe";
		
		int beginIndex = s1.indexOf(myTarget);//29
		//System.out.println(beginIndex);
		
		int endIndex = beginIndex + myTarget.length();//29 + 6 = 35
		//System.out.println(endIndex);
		
		//System.out.println(s1.substring(29,35));
		System.out.println(s1.substring(beginIndex,endIndex));
		
		//how to find all substring of a given String
		String s2 = "Cybertek";
		for(int i=0; i < s2.length(); i++) {
			for(int k=i+1; k <= s2.length(); k++) {
				System.out.println(s2.substring(i, k));
			}
		}
		
	}

}
