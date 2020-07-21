package day_22_String_ClassCont_Lab;

public class String_isEmpty {

	public static void main(String[] args) {
		
		String username = "";
		String password = "";
		
		if(username.isEmpty()) {
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password field can not be empty");
		}else {
			System.out.println("Username or password is not empty");
		}

	}

}
