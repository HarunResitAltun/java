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
		list.add(new Account());
		list.add(new Account());
		

	}

}
