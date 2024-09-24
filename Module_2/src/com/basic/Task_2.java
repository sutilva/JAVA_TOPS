// Write a Java program that takes the user to provide a single character from the alphabet. 
// Print Vowel or Consonant, depending on the user input. 
// If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, 
// print an error message. 


package com.basic;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the single Alphabet");
		String alpha = sc.next();
		
		int len = alpha.length();
		char ch = alpha.charAt(0);
		
		if(len >= 2 || ch >= '0' && ch <= '9') {
			System.out.println("Invalid Input!!");
		}
						
		else if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ) {
			ch = Character.toLowerCase(ch);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("It is a Vowel");
				}
			else {
				System.out.println("It is Consonant");
			}
		}
	}

}
