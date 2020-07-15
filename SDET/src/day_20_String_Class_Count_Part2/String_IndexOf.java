package day_20_String_Class_Count_Part2;

public class String_IndexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		System.out.println(word1.indexOf("java"));
		
		String url = "www.okta.com";
		int i =url.indexOf(".");
		System.out.println("Pos of . " + i);
		
		System.out.println(url.charAt(i+1));
		
		//find position of '-' and check if space is on right and left side
		String title = "Java - Google Search";
		
		int  dash = title.indexOf('-');
		System.out.println(title.charAt(dash-1));
		System.out.println(title.charAt(dash+1));
		System.out.println("apple");
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of the states: " + states);
		
		String word2 = "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		//indexOf()
		if(word2.indexOf("c++") > -1){
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}

	}

}
