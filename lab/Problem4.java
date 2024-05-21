package com.lab;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
                double num1, num2,output;
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter first number:");

		        num1 = scanner.nextDouble();
		        System.out.print("Enter second number:");
		        num2 = scanner.nextDouble();

		        System.out.print("Enter an operator (+, -, *, /,%): ");
		        char  op = scanner.next().charAt(0);

		        

		        switch(op)
		        {
		            case '+':
		            	output = num1 + num2;
		                break;

		            case '-':
		            	output = num1 - num2;
		                break;

		            case '*':
		            	output = num1 * num2;
		                break;

		            case '/':
		            	output = num1 / num2;
		                break;

		            case '%':
		            	output = num1 % num2;
		            	break;
		            default:
		                System.out.printf("You have entered wrong operator");
		                return;
		        }

		        System.out.println(num1+" "+op+" "+num2+" = "+output);
		    
	}
}
