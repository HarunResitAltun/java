package reviewSessions.week3;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int num1 = 55;
		int num2 = 100;
		
		int max = (num1>num2) ? num1 : num2;//this is basically if else statement. 
											//if(num1>num2){
										    //    max = num1;
											//}else {
											//    max = num2;
											//}
		System.out.println(max);
		
		if(num1>num2){
		    	max = num1;
			}else {
				max = num2;
			}
		
		int score = 88;
		String result = (score>=60) ? "pass" : "fail";
		System.out.println(result);
		

	}

}
