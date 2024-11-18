/*
 * W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument and 
 * perform the division operation and handle Arithmetic O/P- Exception in thread main java. Lang. 
 * Arithmetic Exception:/ by zero
 */


package com.exception;

import java.util.Scanner;

public class Task_4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
