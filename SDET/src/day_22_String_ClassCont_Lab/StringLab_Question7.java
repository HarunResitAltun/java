package day_22_String_ClassCont_Lab;

public class StringLab_Question7 {

	public static void main(String[] args) {
		
			System.out.println(comboString("Hello", "Hi"));
			System.out.println(comboString("aaa", "b"));
			System.out.println(comboString("Hello", "Hi"));

	}
	public static String comboString(String str1, String str2) {
		
		String str;
		if(str1.length()>str2.length()) {
			str = str2.concat(str1).concat(str2);
		}else {
			str = str1.concat(str2).concat(str1);
		}
		return str;
	}
}
