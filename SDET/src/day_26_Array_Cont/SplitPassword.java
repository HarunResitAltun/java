package day_26_Array_Cont;

import java.util.Arrays;

public class SplitPassword {

	public static void main(String[] args) {
		
		String info1 = "This info used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		String[] pss1 = info1.split("xxx");
		String[] pss2 = info2.split("xxx");
		
		System.out.println(pss1[1]+pss2[1]);
		
		System.out.println("----------------------------------");
		
		String[] pas1 = info1.split("password :");
		String[] pas2 = info2.split("password :");
		
		System.out.println(Arrays.deepToString(pas1));
		System.out.println(Arrays.deepToString(pas2));
		
		String pass1 = pas1[1].split(". Please")[0];
		String pass2 = pas2[1].split(". Please")[0];
		
		System.out.println(pass1);
		System.out.println(pass2);
		
		pass1 = pass1.substring(4, 10);
		pass2 = pass2.substring(4, 10);
		
		System.out.println(pass1);
		System.out.println(pass2);
		
		System.out.println(pass1.trim() + pass2.trim());
		
		
		

	}

}
