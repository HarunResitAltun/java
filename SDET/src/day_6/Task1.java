package day_6;

public class Task1 {

	public static void main(String[] args) {
		
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shinny";
		Degree = 70;
		
		boolean comp2 = (!(OutsideWeather == "Rainy" || Degree == 70));
		
		System.out.println(comp2);//False || True = !True => False		

	}

}
