package reviewSessions.week2;

public class task {

	public static void main(String[] args) {
		
		int pies = 10;
		int people = 4;
		double piesPerson;
		
		piesPerson = pies/people;// int / int = int => 10 / 4 = 2;
		System.out.println(piesPerson);// result will shown in double and show the result with .; 2.0
		
		piesPerson = pies / (double)people;// int / double = double => 10 / 4.0
		System.out.println(piesPerson);
		
		piesPerson = (double)(pies/people);//(double)(int/int) => (double)2 => 2.0
		System.out.println(piesPerson);
		
		piesPerson = (double)pies / people;//double / int => 10.0 / 4
		System.out.println(piesPerson);
		
		double result = (1/2)*2;//(int / int) * int => int * int => 0 * 2 = 0.0
		System.out.println(result);
		
		
	}

}
