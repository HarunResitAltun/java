package day_27_Array_Cont_Lab;

public class Length {

	public static void main(String[] args) {
		
		int [][] number = {
				
				{1,2,3,4},			 //Row 1
				{5,6},				 //Row 2
				{9,10,11,23,30,50,60}//Row 3
		};
		
		//Display the number of rows
		System.out.println(number.length);//display the number of rows

		for(int i=0; i<number.length;i++) {
			System.out.println("The number of columns in row " + i + " is " + number[i].length);
		}
		
		for(int i=0; i<number.length; i++) {//row numbers
			for(int j=0;j<number[i].length; j++) {//column numbers
				
				System.out.println(number[i][j]);
			}
		}
	}

}
