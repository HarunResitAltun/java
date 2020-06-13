package day_12;

public class labeledStatement {

	public static void main(String[] args) {
		
		int i=0;
		outer://outer can be any name harun, ozzy, selcuk bla bla...
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break outer;
						}
					}
			}while(true);

	}

}
