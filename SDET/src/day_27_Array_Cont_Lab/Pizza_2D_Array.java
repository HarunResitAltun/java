package day_27_Array_Cont_Lab;

import java.util.Arrays;

public class Pizza_2D_Array {

	public static void main(String[] args) {
		
		String[][] pizzas = {
				
				{"pinneapple","pepperoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onioons"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		};
				
		//System.out.println(Arrays.toString(pizzas[0]));
		System.out.println("###FOR EACH LOOP###");
		for(String[] pizza : pizzas) {//pizza is row
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
			
		}
		
		System.out.println("###FOR ITERATOR LOOP###");
		for(int i=0;i<pizzas.length;i++) {
		
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
				
		}
		
		for(String value : pizzas[3]) {//printing each item at the row.
			System.out.println(value);
		}
		
		int [][]students = {
				{4,5,6},
				{12,5,7},
				{23,56,12,55,3}
			};
		
		for(int [] group : students) {//we put [] because we want to take each group.
			for(int studentID : group) {
				System.out.println(studentID);
			}
		}
		
		

	}

}
