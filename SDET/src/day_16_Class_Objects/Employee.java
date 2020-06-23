package day_16_Class_Objects;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println("The name of the  employee is " + name);
		
	}
	
	public void attendMeeting() {
		System.out.println("All " + jobTitle + " will attend the meeting");
		
	}
	
	public void introduce() {
		System.out.println("Name:" + name + "Job title: " + jobTitle + "Salary: " + salary);
		
	}

}
