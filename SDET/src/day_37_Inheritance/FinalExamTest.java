package day_37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		//ask user how many question in the exam,
		//ask user how many question is missed,
		//give user the final grade,
		
		Scanner scn = new Scanner(System.in);
		System.out.println("How many question in the exam?");
		int numQ = scn.nextInt();
		System.out.println("How many question is missed?");
		int misQ = scn.nextInt();
		
		FinalExam exam = new FinalExam(numQ,misQ);
		
		System.out.println("The score is " + exam.getGrade());
	}

}
