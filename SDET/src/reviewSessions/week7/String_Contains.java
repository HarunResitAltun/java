package reviewSessions.week7;

public class String_Contains {

	public static void main(String[] args) {
		
		String str = "Amazon Website";
		
		System.out.println(str.contains("AmaZon"));
		
		if(str.contains("web")) {
			System.out.println("There is web in the string");
		}else {
			System.out.println("There is no web in the string");
		}
		
		String title = "Porsche HOME - Porsche USA";
		if(title.contains("Porsche")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		
		String email = "employee@tmail.com";
		
		if(email.contains("@yahoo")) {
			System.out.println("This email is yahoo");
		}else if (email.contains("@gmail")) {
			System.out.println("This email is gmail");
		}else if (email.contains("@hotmail")) {
			System.out.println("This email is hotmail");
		}else {
			System.out.println("Some other mail");
		}

	}

}
