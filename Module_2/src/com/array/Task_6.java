//Write a java program to reverse a string and check that the string is palindrome or not. 



package com.array;

import java.util.Scanner;

public class Task_6 {
	public static void main(String[] args) {
		
		
		//Input string from user
		Scanner sc = new Scanner(System.in);
		boolean palindrome = false;
		
		System.out.println("Enter the String: ");
		String str = sc.next();
		char c [] = str.toCharArray();
				
		char [] rev = new char[c.length];
		
		
		// Reverse the string
		for(int i = 0; i < c.length; i++) {
			rev[i] = c[c.length-1-i];							
			}
		
		// Check Palindrome
		for(int i = 0; i < c.length; i++) {
			if(c[i] == rev[i]) {
				palindrome = true;
			}
			else {
				palindrome = false;
				break;
			}
		}
		
		if(palindrome == true) {
			System.out.println("Given String is palindrome! ");
		}
		else {
			System.out.println("Given String is not palindrome! ");
		}
				
	}
}
