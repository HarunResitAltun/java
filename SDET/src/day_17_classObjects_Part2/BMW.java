package day_17_classObjects_Part2;

public class BMW {
	
	String make;// "BMW"; if we write "BMW" to here, all objects will get BMW as default make. 
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		case "330i":
			price=40250;
			break;
		case "740i":
			price=85000;
			break;
		case "m3":
			price=65000;
			break;
		default:
			System.out.println(model + " is not available");
			price=0.0;
		}
		System.out.println("Price: " + price);
	}

}
