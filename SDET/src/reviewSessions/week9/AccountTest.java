package reviewSessions.week9;

import java.util.ArrayList;
import java.util.List;

public class AccountTest {

	public static void main(String[] args) {
		
		//Array of objects
		//Unlike a traditional array that store values like string, integer, boolean, etc
		//array objects stores Objects. The array elements store the location of the
		//reference variables of the object
		
		Account object[] = new Account[2];
		
		object[0] = new Account();
		object[1] = new Account();
		
		object[0].setData(1, 2);
		object[1].setData(4, 5);
		
		System.out.println("For Array Element 0");
		object[0].showData();
		
		System.out.println("For Array Element 1");
		object[1].showData();
		
		System.out.println("=====================");
		
		List<Account> list = new ArrayList<>();
		
		//I want to create a list
		//what kind of objects u want this list to hold it? -> object belongs to Account class
		
		list.add(new Account());
		list.add(new Account());
		list.add(new Account());
		
		Account a1 = new Account();
		list.add(a1);
		
		list.get(0).setData(1, 3);
		list.get(1).setData(20, 30);
		list.get(2).setData(9, 32);
		
	}
}
