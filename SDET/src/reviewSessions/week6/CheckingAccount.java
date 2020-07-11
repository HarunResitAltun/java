package reviewSessions.week6;

public class CheckingAccount {
	
	double balance;//instance variable saved in heap, these are instance variables.
	long accountNumber;
	String accountHolder;
	String type = "checking"; //set checking as default value
	
	public void setInfo(double pBalance, long pAccNumber, String pAccHolder) {//these are locale variables.
		
		System.out.println("Setting account info...");
		balance = pBalance;//local variable saved in stack
		accountNumber = pAccNumber;
		accountHolder = pAccHolder;
		
	}
	
	public void getAccountInfo() {
		System.out.println("Checking Account: $" + balance + "," + accountNumber + "," + accountHolder);
	}
	
	public void deposit(double amount) {
		System.out.println("Deposit $" + amount + " to account number: " + accountNumber);
		balance+=amount;
	}
	
	public void withdraw (double amount) {
		System.out.println("Withdrawing $ " + amount + " from account number: " + accountNumber);
		if(amount<=balance) {
			balance-=amount;
		}else {
			System.out.println("ERROR: Insufficient Fund In Account. Keep coding Java");
		}
	}
	
	public void purchase(String item, double price) {
		
		System.out.println("Purchasing " + item + " for $" + price);
		
		if (price<=balance) {
			balance-=price;
		}else {
			System.out.println("Insufficient Fund - Overdraft fee is applied");
			balance-=(price + 35);
		}
		
		System.out.println("Transaction completed for " + item + " ,current balance:" + balance);
	}
}
