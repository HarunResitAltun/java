package reviewSessions.week2;

public class usingVariables {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		num1 = 100;
		num2 = num1;//copy 100 and assign to num2
		num3 = num2;//copy 100 and assign to num3
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("================");
		
		
		num1=500;// only changes the num1 value, doesn't have any effect on num2 and num3
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
