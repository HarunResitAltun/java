package reviewSessions.week9;

public class PasswordValidation {

	public static void main(String[] args) {
		
		/*
		 Write a return method that can verify if a password is valid or not
		 Requirements;
		 1-Password MUST be at least have 6 characters and should not contain space;
		 2-Password should at least contain one upper case letter
		 3-Password should at least contain one lower case letter
		 4-Password should at least contain one special character
		 5-Password should at least contain a digit
		 If all requirements above met, the method returns true, otherwise returns false
		 */
		
		System.out.println(passwordValidation("123.6"));
		System.out.println(passwordValidation("123$456qH"));
		System.out.println(passwordValidation("123& 456rN"));
		System.out.println(passwordValidation("123789lO"));
		System.out.println(passwordValidation("098%456K"));
		System.out.println(passwordValidation("123#456a"));
	}
	
	public static String passwordValidation(String str) {
		
		boolean length = false;
		boolean space = true;
		boolean lower = false;
		boolean upper = false;
		boolean digit = false;
		boolean special = false;
		
		if(str.length()>=6) {
			length=true;
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isSpaceChar(str.charAt(i))) {
				space = false;
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				lower = true;
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upper = true;
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				digit = true;
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetterOrDigit(str.charAt(i)) && !Character.isSpace(str.charAt(i))) {
				special = true;
				break;
			}
		}
		
		if(length && space && lower && upper && digit && special) {
			return "valid";
		}else {
			return "not valid";
		}
	}
}
