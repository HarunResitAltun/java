package day_13_Methods_Part1;

public class GoogleSearch {

	public static void main(String[] args) {
		
		//TC
		
		navigateGoogle();
		searchForShoes();
		printResults();

	}
	
	public static void navigateGoogle() {
		
		System.out.println("launch chrome browser");
		System.out.println("navigate to google.com");
	}
	
	public static void searchForShoes() {
		
		System.out.println("type shoes into search field");
		System.out.println("click on search button");
	}

	public static void printResults() {
		
		System.out.println("result for shoes ....");
	}
}
