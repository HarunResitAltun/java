package assignment_4;

public class question_4 {

	public static void main(String[] args) {
		
		double price = 0;
		int call = 210;
		
		if (call <= 100){
			price=200;
		}else if (call > 100 && call <= 150){
			price = (200 + (0.60 * (call - 100)));
		}else if (call > 150 && call <= 200){
			price = (200 + (0.50 * (call - 150)));
		}else if (call > 200){
			price = (200 + (0.40 * (call - 200)));
		}
		System.out.println("The monthly telephone bill is " + "$" + price);
	} 

}
