package reviewSessions.week9;

public class WrapperClasses {

	public static void main(String[] args) {
			
			Boolean b1 = new Boolean(true);
			Boolean b2 = new Boolean("true");
			Boolean b3 = Boolean.valueOf(false); //java 12 preferred
			Boolean b4 = Boolean.valueOf("false");
			
			Character c1 = new Character('a');
			Character c2 = Character.valueOf('b');
			
			Integer i1 = new Integer(1000);
			Integer i2 = Integer.valueOf(2000);
			Integer i3 = Integer.valueOf("3000");
					
			System.out.println(Integer.sum(10, 20));
			System.out.println(Integer.max(10, 20));
			System.out.println(Integer.min(10, 20));
			
			//compare
			/*
			 first is larger than second - > 1
			 equals  - > 0
			 second is larger than first - > -1
			 */
			System.out.println(Integer.compare(10, 15));
			
			
			//Convert a String into int
			String countStr = "3456";
			int intCount = Integer.parseInt(countStr);
			System.out.println(intCount);
			
			int intCount2 = Integer.valueOf(countStr);
			System.out.println(intCount2);
		}

}
