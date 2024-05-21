package com.labassignment;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int input= sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			result = input*i;
			System.out.println(input+"*"+i+" = "+result);
		}
	}
}
