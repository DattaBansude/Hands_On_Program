package com.labassignment;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		result = num * num * num;
		System.out.println("The cube of given no is: "+result);
		
	}
}
