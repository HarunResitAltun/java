package day33_ClassObject_Constructors;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	public Mouse(int weight) {
		this(30,weight);
		this.weight = weight;
		System.out.println("Java");
	}

	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20,weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}

	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("TS");
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
}
