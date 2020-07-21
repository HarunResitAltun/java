package day_31_Array_List;
import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		
		//Languages
		//Print size of the ArrayList
		//Read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("English");
		languages.add("Korean");
		languages.add("Turkish");
		languages.add("Java");
		languages.add("Arabic");
		
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());
		
		languages.add("Russian");
		System.out.println(languages.toString());
		
		languages.remove(0);
		System.out.println(languages.toString());
		System.out.println("Number of values: " + languages.size());

	}

}
