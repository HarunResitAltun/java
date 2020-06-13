package day_11;

public class whileLoop {

	public static void main(String[] args) {
		
		//print 0-10
		
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//using a loop, iterate until we have 10 student in the room
		
		int numberOfStudents=1;
		
		while(numberOfStudents<=10) {
			System.out.println("Student" + numberOfStudents);
			numberOfStudents++;
		}
		
		int num=11;
		while(num>=1) {
			System.out.print(num + " ");
			num--;
		}

	}

}
