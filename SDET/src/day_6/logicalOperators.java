package day_6;

public class logicalOperators {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;
		
		boolean resl = (i1==i2)&(c1==c2);//False & True = False
		System.out.println("resl = " + resl);
	
		boolean res2 = (c1==c2)|(i1==i2); // True | True = True
		System.out.println("res2 = " + res2);

		boolean res3 = (c1==c2)|(i1==i2);//True | False = True
		boolean res4 = (c1==c2)|| (i1==i2);//True || ------ = True
		
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
		boolean res5 = (c1==c2)^(i1==i2);
		System.out.println("res5 = " + res5);// True ^ False = True
		
		boolean res6 = (c1==c2)^(i1!=i2);
		System.out.println("res5 = " + res6);// True ^ True = False
	}

}
