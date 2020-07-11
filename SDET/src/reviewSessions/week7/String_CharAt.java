package reviewSessions.week7;

public class String_CharAt {

	public static void main(String[] args) {
		
		String company = "Cybertek";
		System.out.println(company.charAt(0));
		//company.charAt(2);//method is returning the value and holding it. You can assign the value or print it.
		System.out.println(company.charAt(2));
		System.out.println(company.charAt(company.length()-1));
		
		
		for(int i=0 ; i<company.length(); i++) {
			System.out.print(company.charAt(i) + " ");
		}
		
		System.out.println(" ");
		
		String str1 = "Cybertek";
		String str2 = "Java Course";
		
		System.out.println(str1.concat(str2));
		
		//System.out.println(str1.concat('a'));// concat is String method and doesn't accepting char parameter.
	}

}
