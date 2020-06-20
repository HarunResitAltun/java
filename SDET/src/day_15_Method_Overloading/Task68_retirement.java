package day_15_Method_Overloading;

public class Task68_retirement {

	public static void main(String[] args) {
		
		yearsUntilRetirement("Harun",1984);

	}
	
	public static int calculateAge(int num1) {
		
		int yearBirth = 2020 - num1;
		
		return yearBirth;
	}
	
	public static int yearsUntilRetirement(String name,int year) {
		
		int retirementAge = 65 - calculateAge(year);
				
				System.out.println(name + " retires in " + retirementAge + " years");
		
		return retirementAge;
		
	}

}
