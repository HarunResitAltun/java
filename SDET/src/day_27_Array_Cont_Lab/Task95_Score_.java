package day_27_Array_Cont_Lab;

public class Task95_Score_ {

	public static void main(String[] args) {
		
		int[][] scores = {
				{68,75,54,80},
				{100,64,20,50},
				{10,35,40,90}
		};
		
		int sum=0;
		for(int column=0; column<scores[0].length;column++) {//getting each column
			
			sum = sum + scores[0][column];
		}
		
		//System.out.println(sum);
		System.out.println(sum/scores[0].length);
		
		int sum2=0;
		for(int row=0; row<scores.length;row++) {//getting each row
			
			sum2 = sum2 + scores[row][0];
			
		}
		
		System.out.println(sum2);
		//System.out.println(sum2/scores[0].length);

	}

}
 