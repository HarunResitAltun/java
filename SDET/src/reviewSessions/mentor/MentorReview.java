package reviewSessions.mentor;

import java.util.Scanner;

public class MentorReview {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
		for(int i=0; i<nums.length; i++) {// print not repeated value
			
			int count = 0;
			
			for(int j=0; j<nums.length; j++) {
				
				if(nums[i]==nums[j] && i!=j) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(nums[i]);
			}
		}
		
		for(int i=0; i<nums.length; i++) {// print repeated value
			
			int count = 0;
			
			for(int j=i+1; j<nums.length; j++) {
				
				if(nums[i]==nums[j] && i!=j) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(nums[i]);
			}
		}

	}

}
