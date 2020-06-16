package day_14_Methods_Part2;

public class Lab1_Question6 {

	public static void main(String[] args) {
		
		cigarParty(70,true);

	}
	
	public static void cigarParty(int cigar, boolean weekend) {
		
		if(cigar>=40 && cigar<=60) {
			
			System.out.println(true);
			
		}else if(cigar>60 && weekend) {
			
			System.out.println(true);
			
		}else {
			
			System.out.println(false);
		}
	}

}
