package reviewSessions.week5;

public class Question_4_NumberOfTheBedroom {

	public static void main(String[] args) {
		
		int rent = rentPrice(2);
		System.out.println(rent);
		
		int monthlyIncome = 3000;
		
		double net = monthlyIncome - (rentPrice(2) + calculateEx(2));
		System.out.println(net);

	}
	
	public static int rentPrice(int room) {
		
		int rent = 0;
		
		if(room==1) {
			rent = 1100;
		}else if(room==2) {
		    rent = 1850;
		}else if(room==3) {
			rent = 2550;
		}
		return rent;
		
	}

	public static double calculateEx(int room) {
		
		double expenses = rentPrice(room) * 0.5;
		
		return expenses;

	
	}

}

