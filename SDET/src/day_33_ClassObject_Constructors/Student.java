package day_33_ClassObject_Constructors;

public class Student {
	
	String name;
	int age;
	String gender;
	int year;
	String course;
	String university = "Cybertek";
	
	public Student(String name, int age, String gender, int year, String course) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	
	public void attendLecture() {
		System.out.println(name + " is attanding");
	}
	
	public void submitAssignment() {
		System.out.println(name + " is submitting assignment");
	}
	
	public void attendLab() {
		System.out.println(name + " is attanding Lab");
	}
	

}
