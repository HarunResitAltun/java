package day_22_String_ClassCont_Lab;

public class StringLab_Question6 {

	public static void main(String[] args) {
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Java"));
		System.out.println(withoutEnd("coding"));

	}
	public static String withoutEnd(String str) {
		
		return str.substring(1,str.length()-1);	
	}
}
