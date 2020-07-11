package Gncr_Reviews.week5;

import java.util.Scanner;

public class palidromeNumber {

	  public static void main(String[] args) {
	    
		  Scanner scan = new Scanner(System.in);
	    
		  int num = scan.nextInt();
	    
		  isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	    
	     int r,sum=0,temp;    
	  temp=num;    
	  while(num>0){    
	   r=num%10;  
	   sum=(sum*10)+r;    
	   num=num/10;    
	  }    
	  if(temp==sum) {    
	   System.out.println(true); 
	   
	  }else {   
	   System.out.println(false);
	   
	  }
	  }
}