package day_32_Array_List_Cont;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(10);
		numList.add(7);
		numList.add(8);
		numList.add(8);
		numList.add(3);
		numList.add(4);
		numList.add(8);
		
		printList(numList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum = sumList(doubleList);
		System.out.println(sum);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list = getList(25);
		System.out.println(list.toString());
		
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		
		System.out.println(strNums);//printing strings
		
		ArrayList<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
		
	}
	
	public static void printList(ArrayList<Integer> arrList) {
		
		for(Integer value : arrList) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	public static double sumList(ArrayList<Double> sList) {
		
		double sum = 0;
		for(Double d : sList) {
			sum = sum + d;
		}
		return sum;
	}
	
	public static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		/*for(int i=0;i<size;i++) {
			newList.add(i);
		}*/
		for(int i=1;i<=size;i++) {
			newList.add(i);
		}
		return newList;
	}
	
	public static ArrayList<Integer> getRandomList(int sizer){
		
		Random r = new Random();
		
		ArrayList<Integer> randomNums = new ArrayList<>();
		
		for(int i=1;i<=sizer;i++) {
			
			randomNums.add(r.nextInt(101));
		}
		
		return randomNums;
	}
	
	public static ArrayList<Integer> convertToIntList(ArrayList<String> strNums){
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(String str : strNums) {
			
			newList.add(Integer.parseInt(str));
		}
		
		return newList;
	}

}
