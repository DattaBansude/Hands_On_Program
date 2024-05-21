package com.labassignment;

import java.util.Scanner;

public class Sum_of_Natural_No {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no: ");
		int n =sc.nextInt();
		System.out.println("the number are: "+ n);
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			sum =sum +i;
			
		}
		System.out.println("sum is "+sum);
	}
}
