package day_6;

public class Task3 {

	public static void main(String[] args) {
		
		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b == 2;
		System.out.println(res);//False || True && False => False || False => False

	}

}
