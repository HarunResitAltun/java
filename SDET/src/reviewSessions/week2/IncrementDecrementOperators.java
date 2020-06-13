package reviewSessions.week2;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		

		int x = 2;
		int y = x++;
		System.out.println(y);//2
		System.out.println(x);
		
		
		int a = 5;
		int b = a*5 - a--;
		
		System.out.println(a);
		System.out.println(b);
		
		a=5;
		b = a-- + ++a + ++a - a--;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(!true);//! means not equal to; true = false;
		System.out.println(!!true);// treu = false =true;
			
			

	}

}
