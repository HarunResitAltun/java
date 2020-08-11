package repl;

public class $166_return_profit {

	public static void main(String[] args) {
	
		c_profis(100,1500);
		c_profis(20,5);
		c_profis(100,100);
	}
	public static String c_profis (int buyPrice,int sellPrice){
			    
		if(buyPrice<sellPrice){
			return "profit";
		}
		if(buyPrice>sellPrice){
			return "loss";
		}
		if(buyPrice==sellPrice){
			return "no loss";
		}
		return null;
	}
}