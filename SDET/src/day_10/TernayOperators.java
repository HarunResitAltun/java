package day_10;

public class TernayOperators {

	public static void main(String[] args) {
		
		String result;
		int score = 88;
		result = score>68 ? "pass" : "fail";
		
	//	if(score>68) {
	//		result="pass";
	//	}else {
	//		result="fail";
	//	}
		System.out.println(result);
		
		
		int x = 3;
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
		
	//	if(x>2) {
	//		if(x<4) {
	//			System.out.println(10);
	//		}else {
	//			System.out.println(8);
	//		}
	//	}else {
	//		System.out.println(7);
		}
	}


