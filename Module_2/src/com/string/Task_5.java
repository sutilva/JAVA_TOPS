/*
 * 
 * W.A.J.P to get the character at the given index within the String. Original 
 * String = Tops Technologies! The character at position 0 is T, The character at 
 * position 10 is o 
 * 
 */


package com.string;

import java.util.Scanner;

public class Task_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		if(index < 0 || index >= str.length()) {
			System.out.println("Invalid Index");
		}
		else {
			System.out.println("The character at position " + index + " is " + str.charAt(index));
			
		}
		sc.close();
	}
}
