package day_8;

public class Task34 {

	public static void main(String[] args) {
		// mark calculation
		
		int mark1=63;
		int mark2=92;
		int mark3=94;
		double markaverage;
		markaverage=(mark1+mark2+mark3)/3;
		System.out.println("Marks average is " + markaverage);
		
		
		if ((markaverage>=0) && (markaverage<=59)){
			System.out.println("Grade is F");
		}else if ((markaverage>=60) && (markaverage<=69)){
			System.out.println("Grade is E");
		}else if ((markaverage>=60) && (markaverage<=69)){
				System.out.println("Grade is D");
		}else if ((markaverage>=70) && (markaverage<=79)){
			System.out.println("Grade is C");
		}else if ((markaverage>=80) && (markaverage<=89)){
				System.out.println("Grade is B");
		}else if ((markaverage>=90) && (markaverage<=100)){
			System.out.println("Grade is A");
		}else {
			System.out.println("Invalid marks");
		}

	}

}
