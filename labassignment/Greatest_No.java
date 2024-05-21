package com.labassignment;

import java.util.Scanner;

public class Greatest_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter num3: ");
		int num3 = sc.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("num1 is  greater: "+num1);
			}
		}
		if (num2>num1) {
			if (num2>num3) {
				System.out.println("num2 is  greater: "+num2);
			}
		}
		if (num3>num1) {
			if (num3>num2) {
				System.out.println("num3 is  greater: "+num3);
			}
		}
	}
}
