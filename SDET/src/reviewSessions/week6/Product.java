package reviewSessions.week6;

public class Product {
	
	String title;
	double price;
	int rating;
	String seller;
	
	public void displayInfo() {
		
		System.out.println("--------Product Info--------");
		System.out.println("Title=" + title);
		System.out.println("Price=" + price);
		System.out.println("Rating=" + rating);
		System.out.println("Seller=" + seller);
	}
}
