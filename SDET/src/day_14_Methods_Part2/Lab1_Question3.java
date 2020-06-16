package day_14_Methods_Part2;

public class Lab1_Question3 {

	public static void main(String[] args) {
		
		specialEleven(33);

	}
	
	public static void specialEleven(int num1) {
		
		//int if(num1==11 || num1%11==0)
		if(num1%11==0 || num1%11==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
