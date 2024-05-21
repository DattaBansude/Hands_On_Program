package com.labassignment;
//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class Positive_Or_Negative {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int x = sc.nextInt();
		if (x > 0) {
			System.out.println("Number is positive " + x);
		} else if (x == 0) {
			System.out.println("Number is Neutral " + x);
		} else {
			System.out.println("Number is Negative " + x);
		}
	}
}
