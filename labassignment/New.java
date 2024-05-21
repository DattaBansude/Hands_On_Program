package com.labassignment;
import java.text.*;
public class New {

	 

	public static void main(String args[]) {

	NumberFormat obj= NumberFormat.getInstance();

	obj.setMaximumFractionDigits(3);

	obj.setMinimumFractionDigits(2);

	String a = obj.format(4.12762443);

	String b = obj.format(3);

	System.out.println(a+" "+b);

	

	}
}
