/*
 * 
 * Write a Java program to print the ASCII value of a given character.
 * 
 */


package com.string;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(0);
		
		System.out.println("ASCII Value of " + c + " is " + (int) c);
		
		sc.close();
		
		
		
	}
}
