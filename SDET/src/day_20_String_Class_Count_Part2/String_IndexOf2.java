package day_20_String_Class_Count_Part2;

public class String_IndexOf2 {

	public static void main(String[] args) {
		//index of with 2 value
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf('-');
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", 5);//looking for the "-" after index number 5
		System.out.println(secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);

		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);
	}

}
