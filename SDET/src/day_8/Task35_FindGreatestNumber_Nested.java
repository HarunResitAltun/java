package day_8;

public class Task35_FindGreatestNumber_Nested {

	public static void main(String[] args) {
		

		int n1=10;
		int n2=10;
		int n3=10;
		
		//find the greatest with by using nested if
		
		if (n1>n2 && n1>n3) {
			System.out.println("n1 is biggest");
		}else {
			if(n2>n3) {
				System.out.println("n2 is biggest");
			}else if (n3>n2){
				System.out.println("n3 is biggest");
			}else {
				System.out.println("Numbers are equal");
			}
		}
	}

}
