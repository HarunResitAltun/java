package day_13_Methods_Part1;

public class StudentMethod {

	public static void main(String[] args) {
		
		//You cannot create a new method inside a method.
		//You can create a new method inside a class.

		sayHello(); //We call the method
		sayHello(); //We can call the created method as much as we want.
		//sayHello();
		//sayHello();
		//sayHello();
		//sayHello(); 
		//sayHello();
		//sayHello();
		//sayHello();
		//sayHello();
		//sayHello();
		code();		//complier run the method one by one according to the list.
		study();
		
		
	}
	
	public static void sayHello() { //We declare the method here
		
		System.out.println("Inside sayHello method");
	}

		//We can create method inside a class as much as we need.
	
	public static void code() {
		
		System.out.println("Student is studying");
	}
	
	public static void study() {
		
		System.out.println("Student is studying java");
	}
}
