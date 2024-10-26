/*
 * Create a class named 'Print Number' to print various numbers of different data 
 * types by creating different methods with the same name 'printn' having a parameter for each data type.
 */

package com.string;

class PrintNumber {
	
	protected void printn (int a) {
		System.out.println("Integer = " + a);
	}
	
	protected void printn (double a) {
		System.out.println("Double = " + a);
	}
	
	protected void printn (float a) {
		System.out.println("Float = " + a);
	}
	
	protected void printn (String a) {
		System.out.println("String = " + a);
	}
}

public class Task_12 {
	public static void main(String[] args) {
		
		PrintNumber p = new PrintNumber();
		
		int num1 = 100;
		double num2 = 200.121243;
		float num3 = 100/3;
		String str = "Shiv";
		
		p.printn(num1);
		p.printn(num2);
		p.printn(num3);
		p.printn(str);		
		
	}
}

