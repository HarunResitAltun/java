package reviewSessions.week7;

public class String_Replace {

	public static void main(String[] args) {
		
		String words = "pascal ,unix,phyton";
		
		System.out.println(words.replace("pascal", "java"));
		
		words = words.replace(",", "|");
		System.out.println(words);
		
		String myString = "       Horse       Cow\n\n     \r  Camel \t\t Sheep  \n Goat";
		
		String regex = "\\s";
		String replacement = "";
		
		String newString = myString.replaceAll(regex, replacement);
		System.out.println(newString);
		
		String amazonResult = "iphone case (212,713 Results)";//212713
		
		//amazonResult = amazonResult.replace("iphone case (212,713 Results)", "212713");
		//System.out.println(amazonResult);
		
		amazonResult = amazonResult.replace("iphone case (", "");
		amazonResult = amazonResult.replace(",", "").replace(" Results)", "");//nested replacement
		//amazonResult = amazonResult.replace(" Results)", "");
		
		System.out.println(amazonResult);

	}

}
