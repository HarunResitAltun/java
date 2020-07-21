package day_22_String_ClassCont_Lab;

public class String_Starts_Ends_With {

	public static void main(String[] args) {
		
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));
		
		//Mr. = > married man
		//Mrs.= > married woman
		//Ms. = > Some woman
		//Dr. = > Doctor or woman
		//No title = > Unknown status
		
		String name = "Mr. Jackson";
		
		if(name.startsWith("Mr.")) {
			System.out.println("Married man");
		}else if(name.startsWith("Mrs.")){
			System.out.println("Married woman");
		}else if(name.startsWith("Ms.")){
			System.out.println("Some woman");
		}else if(name.startsWith("Dr.")){
			System.out.println("Doctor or woman");
		}else {
			System.out.println("Unknown status");
		}
	}
}
