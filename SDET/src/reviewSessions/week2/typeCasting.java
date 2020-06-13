package reviewSessions.week2;

public class typeCasting {

	public static void main(String[] args) {
		
		int i = 100;
		long l = i;//implicit Casting,
		float f = i;//implicit Casting,
		
		System.out.println("Int Value:" + i);
		System.out.println("Long Value:" + l);
		System.out.println("Float Value:" + f);//float and double are decimal numbers.
		
		System.out.println("----------------------------");
		
		double d = 100.04;
		long l2 = (long)d;
		int i2 = (int)l2;//We do casting due to java cannot convert long to intiger. Bigger to smaller one
		
		System.out.println(i2);
		
		double d2 = 120.34;
		int i3 = (short)d2;
		System.out.println(i3);


	}

}
