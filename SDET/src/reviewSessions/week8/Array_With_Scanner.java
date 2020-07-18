package reviewSessions.week8;

import java.util.Scanner;

public class Array_With_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		
		for(int i=0; i<5;i++) {
			System.out.println("Enter score " + (i+1));
			scores[i] = scan.nextInt();
		}
		
		//print all score in one line
		for(int score : scores) {
			System.out.print(score + " ");
		}
		
		//find max/largest score
		
		int max = 0;
		//for(int i=0;i<scores.length;i++) {
		for(int i=0;i<5;i++) {
			
			if(scores[i]>max) {
				max=scores[i];
			}		
		}
		System.out.println("Max=" + max);
		
		//find min score
		int min = scores[0];
		for(int value : scores) {
			if(value<min) {
				min=value;
			}
		}
		System.out.println("Min=" + min);	
	}
}
