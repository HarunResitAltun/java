package day_16_Class_Objects;

public class Contact {
	
	String name;
	String phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Name is " + name);
		
	}
	
	public void sendMessage() {
		System.out.println("Phone number is " + phoneNumber);
		
	}
	
	public void sendEmail() {
		System.out.println("Email is " + email);
		
	}

}
