/*
 * 
 * Write a Java program that accepts an integer (n) and computes 
 * the value of n+nn+nnn. Input number: 5 5 + 55 + 555 
 * 
 */


package com.string;

import java.util.Scanner;

public class Task_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		sum = n + ((10*n) + n) + ((100*n) +(10*n) + n);
		
		System.out.println(n + " + " + n + n + " + " + n + n + n + " = " + sum );
		
		sc.close();
	}
}
