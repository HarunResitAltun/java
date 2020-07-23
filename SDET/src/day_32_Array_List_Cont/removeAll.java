package day_32_Array_List_Cont;

import java.util.ArrayList;

public class removeAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(30);list1.add(12);list1.add(22);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(30);list2.add(345);list2.add(1);list2.add(12);list2.add(22);list2.add(12);
		
		System.out.println(list1);
		System.out.println(list2);
		
		//remove all matching vakues from list1
		list2.removeAll(list1);
		
		System.out.println(list2);
	}
}
