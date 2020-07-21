package day_22_String_ClassCont_Lab;

public class StringLab_Question2 {

	public static void main(String[] args) {
		
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up"));

	}
	public static String makeAbba(String str1, String str2) {
		
		//return str1 + str2 + str2 + str1;
		return str1.concat(str2).concat(str2).concat(str1);
	}

}
