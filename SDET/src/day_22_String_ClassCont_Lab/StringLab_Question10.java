package day_22_String_ClassCont_Lab;

public class StringLab_Question10 {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));

	}
	public static boolean frontAgain(String str) {
		
		String first2 = str.substring(0,2);
		String last2 = str.substring(str.length()-2);
		
		return first2.equals(last2);
	}

}
