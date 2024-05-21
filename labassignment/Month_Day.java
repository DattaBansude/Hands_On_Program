package com.labassignment;

import java.util.Scanner;

public class Month_Day {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month number: ");
        int m = sc.nextInt();

        System.out.print("Enter a year: ");
        int y = sc.nextInt();

        switch (m) {
            case 1:
            	System.out.println("Month: January\n No of days: 31");
               
                break;
            case 2:
            	System.out.println("Month: February");
             
                if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
                	System.out.println("No of days: 29");
                } else {
                    System.out.println("No of days: 28");
                }
                break;
            case 3:
            	System.out.println("Month: March \nNo of days: 31");
                break;
            case 4:
            	System.out.println("Month: April \nNo of days: 30");
                break;
            case 5:
            	System.out.println("Month: May \nNo of days: 31");
                break;
            case 6:
            	System.out.println("Month: June \nNo of days: 30");
                break;
            case 7:
            	System.out.println("Month: July \nNo of days: 31");
                break;
            case 8:
            	System.out.println("Month: August \nNo of days: 31");
                break;
            case 9:
            	System.out.println("Month: September \nNo of days: 30");
                break;
            case 10:
            	System.out.println("Month: October \nNo of days: 31");
                break;
            case 11:
            	System.out.println("Month: November \nNo of days: 30");
                break;
            case 12:
            	System.out.println("Month: December \nNo of days: 31");
               break;
            default:
            	System.out.println("Invalid Input");
            	break;
        }
        System.out.print("");
    }
	
}
