package day_34_Constructors;

public class DiceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES=6;
		Dice sixDice = new Dice(SIX_SIDES);
		
		rollDice(sixDice);

	}
	
	public static void rollDice(Dice d) {
		System.out.println("Rollong a " + d.getSides() + " sided dice" );
		
		System.out.println("The dice's value : " + d.getValue());
	}

}
