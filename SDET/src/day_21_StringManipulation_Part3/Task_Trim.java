package day_21_StringManipulation_Part3;

public class Task_Trim {

	public static void main(String[] args) {
		
		String str = " 342 ";
		System.out.println(str.replace(" ", "|"));
		System.out.println("|" + str.trim() + "|");

	}

}
