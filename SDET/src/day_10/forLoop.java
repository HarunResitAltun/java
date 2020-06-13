package day_10;

public class forLoop {

	public static void main(String[] args) {
		
		//print 5 times hello
		System.out.println("Hello");	//1
		System.out.println("Hello");	//1+1
		System.out.println("Hello");	//2+1
		System.out.println("Hello");	//3+1
		System.out.println("Hello");	//4+1
		
			for(int i=0 ; i<5 ; i++) {
				System.out.println("Hello World");
		
			}
			
		    for(int i1=5; i1<10 ; i1++) {
		        System.out.println("i1= " + i1);
		
		    }
			
		    for(int i2=20; i2>=10 ; i2--) {
		    	System.out.println("i2= " + i2);
		
		    }
		
			for(int i3=0; i3<=100 ; i3+=10) {
			  	System.out.println("i3= " + i3);
			  	
			}
		
			for(int i4=100; i4>=0 ; i4-=10) {
			  	System.out.println("i4= " + i4);
				
			}
			
			for(int i5=50; i5>0 ; i5-=5) {
				System.out.println("i5= " + i5);
			}

	}

}
