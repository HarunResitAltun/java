package reviewSessions.week2;

public class concat {

	public static void main(String[] args) {
		// concatenation
		
		int age = 35;
		
		System.out.println("My age is " + age);
		
		String city1 = "New York";
		String city2 = "Chicago";
		double ticketPrice=285.99;
		
		System.out.println("From " + city1 + " to " + city2 + " is $" + ticketPrice);
		
		System.out.println("Apple" + 45);//String + int =>Concatenation,
		System.out.println(45+"Apple");//int + String => Concatenation,
		System.out.println(45+45);//int + int => addition,
		System.out.println(45+45+"Apple");//(int + int) + String => int + String => Concat,
		System.out.println("Aple" + 45 + 45);//String + int + int =>(String + int) => Concat,
		System.out.println("Apple" + (45+45));// String +(int+int)=>String + int => Concat,
		System.out.println("Apple" + 45 + 45 + "Appl");//String + int + int + String=>Concat,
		System.out.println("45" + "45" + 45 + 45);
		System.out.println(45 + (-45));
	}

}
