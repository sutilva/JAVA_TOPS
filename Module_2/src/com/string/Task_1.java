/*
 * 
 * Write a Java program to count the letters, spaces, numbers and other characters of an input 
 * string.
 *  
 */


package com.string;

import java.util.Scanner;

public class Task_1 {
	
	public static void main(String[] args) {
		
		int letters = 0;
		int spaces = 0;
		int numbers = 0;
		int otherChar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input String: ");
		String str = sc.nextLine();
		
		char [] c = str.toCharArray();
		
		int length = c.length;
		
		for(int i = 0; i < length; i++) {
			if (Character.isLetter(c[i])) {
				letters++;				
			}
			else if (Character.isWhitespace(c[i])) {
				spaces++;
			}
			else if (Character.isDigit(c[i])) {
				numbers++;
			}
			else {
				otherChar++;
			}
		}
		
		System.out.println();
		System.out.println("Number of Letters: " + letters);
		System.out.println("Number of Spaces: " + spaces);
		System.out.println("Number of Numbers: " + numbers);
		System.out.println("Number of Other Characters: " + otherChar);
		
		sc.close();
	}
}
