package day_22_String_ClassCont_Lab;

public class StringLab_Question1 {

	public static void main(String[] args) {
		
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));

	}
	public static String helloName(String str) {
		
		return "Hello ".concat(str).concat("!");
	}

}
