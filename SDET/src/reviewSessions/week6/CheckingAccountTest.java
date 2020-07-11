package reviewSessions.week6;

public class CheckingAccountTest {

	public static void main(String[] args) {
		
		//create an account
		
		CheckingAccount clientOne = new CheckingAccount();
		
		clientOne.accountNumber = 3412546576868L;
		clientOne.accountHolder = "Mike";
		clientOne.balance = 500.0;
		
		clientOne.getAccountInfo();
		
		//create another account and set data using method
		
		CheckingAccount anotherOne = new CheckingAccount();
		anotherOne.setInfo(1500.0, 1234432112345L, "Aaron");
		
		//anotherOne.accountNumber = 1234432123345L;
		//anotherOne.accountHolder = "Mouse";
		//anotherOne.balance = 1500.0;
		
		//anotherOne.getAccountInfo();
		
		//test deposit
		clientOne.deposit(300);
		clientOne.getAccountInfo();
		
		//test withdraw method
		clientOne.withdraw(100);
		clientOne.getAccountInfo();
		
		//call purchase method
		CheckingAccount myAccount = new CheckingAccount();
		myAccount.setInfo(200, 123456789012345L, "Ishak Jr");
		myAccount.purchase("Book", 120);
		
		System.out.println("Current Balance:" + myAccount.balance);
		
		myAccount.purchase("Shoes", 100);
		myAccount.getAccountInfo();
		
		myAccount.deposit(1000);
		myAccount.getAccountInfo();
	}
}
