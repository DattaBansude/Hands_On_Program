package com.module3;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		int result,sum=0,temp;    
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  
		  temp=n;    
		  while(n>0){    
		   result=n%10; 
		   sum=(sum*10)+result;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}
}
