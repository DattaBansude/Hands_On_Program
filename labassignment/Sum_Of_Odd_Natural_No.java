package com.labassignment;

import java.util.Scanner;

public class Sum_Of_Odd_Natural_No {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no: ");
		int n =sc.nextInt();
		System.out.println("the number are: "+ n);
		for (int i = 1; i <= n; i++) {
			System.out.println(2*i-1);
			sum =sum +(2*i-1);
			
		}
		System.out.println("sum is "+sum);
	}
}
