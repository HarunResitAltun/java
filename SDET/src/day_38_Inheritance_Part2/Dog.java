package day_38_Inheritance_Part2;

public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	

	public Dog(int eyes, int legs, int tail, int teeth,
			String coat) {
		super("Yorkie", 1, 1, 8, 20);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	public void chew1() {
		System.out.println("Dog.chew() is called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() is called");
		chew1();
		super.eat();
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		super.move(speed);
	}
}
