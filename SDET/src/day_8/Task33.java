package day_8;

public class Task33 {

	public static void main(String[] args) {
		// Write a Java Program for the following logic:
		// If marks < 60, then print “Fail”
		// If marks >= 60, but less than 90, then print “Pass”
		// If marks >= 90, then print “Passed with Distinction”
		
		int marks=45;
		
		if (marks<60) {
			System.out.println("Fail");
		}else if(marks>=60 && marks<=90) {
			System.out.println("Pass");
		}else if(marks>90) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Invalid Score");
		}

	}

}
