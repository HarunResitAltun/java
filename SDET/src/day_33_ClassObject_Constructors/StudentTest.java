package day_33_ClassObject_Constructors;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Mike", 17, "M", 2016, "Java", "Cybertek University");
		Student student2 = new Student("Smith", 18, "M", 2015, "JS", "Cybertek University");
		Student student3 = new Student("Mary", 19, "F", 2017, "TS", "Cybertek University");
		
		student1.attendLecture();
		student1.submitAssignment();
		student1.attendLab();
		
		System.out.println("===============");
		
		student2.attendLecture();
		student2.submitAssignment();
		student2.attendLab();
		
		System.out.println("===============");
		
		student3.attendLecture();
		student3.submitAssignment();
		student3.attendLab();

	}

}
