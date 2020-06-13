package day_11;

public class forLoopRules {

	public static void main(String[] args) {
		
		// Rule 1 - Creating an infinite loop
		//Components of the for loop are each optional
		
		//for ( ; ; ) {
		//	System.out.println("Hello");
		//}
		
		// int i=1;
		
		// for ( ; i<5; i++) {
		//		System.out.println("Hello");
	    //  }
		
	    //	for ( ; ; i++) {
		//		System.out.println("i");
		//  }
		
		//	for ( ; i<=5;) {
		//		System.out.println("i");
		//  }
		
		// Rule 2 - Adding Multiple Terms to the for statement
		
		int x=0;
		
		for(long y=0, z=4; x<5 && y<10 ; x++, y++) {
			
			System.out.print(y + " ");
			//System.out.print(x);//if you put the x here code will print double number at a line like 
								  //0 01 12 23 34 4 
								  //you can use x in the the for loop due to  it is defined as globally out of the for loop.
								  //However, you can not use z outside of the for loop because it is defined in for loop.
		}
		System.out.println(x);
		
		// Rule 3 - Redeclaring a variable in the init block
		
		//int x = 0;
		//for(long y=0, x=4; x<5 && y<10; x++, y++) { //does not compile
		//	System.out.println("Hello");
		//}
		
		//Rule 4 - Using incompatible data types in the init blok
		//the varaiables in the init block must all be of the same data type
		
		//for(long y=0, int x=4; x<5 && y<10; x++, y++) { //does not compile
				//	System.out.println("Hello");
				//}
		
		//Rule 5 - Using loop variables outside the loop
				
				//for(long y=0, int x=4; x<5 && y<10; x++, y++) { //does not compile
						//	System.out.println("Hello");
						//}
				        //System.out.println(x); // does not compile
	}

}
