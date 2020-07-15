package day_25_Array_Cont;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] products = {"Timberland","Shirt","Watch","Bag","Shooes"};
		double[] prices = {120.0,12.99,300,25,67.89};
		
		for(int i=0;i<products.length;i++) {
			System.out.println(products[i]);
		}
		
		System.out.println("----------------------------");
		
		for(String prod : products) {
			System.out.println(prod);
		}
		
		System.out.println("----------------------------");
		
		for(double prce : prices) {
			System.out.println(prce);
		}
		
		//print products in reverse order
		
		System.out.println("----------------------------");
		
		for (int i=products.length-1; i>=0;i--) {
			System.out.println(products[i]);
		}

	}

}
