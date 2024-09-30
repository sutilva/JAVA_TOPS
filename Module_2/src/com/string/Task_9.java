/*
 * 
 * W.A.J.P to check whether a given string starts with the contents of another string. 
 * Red is favorite color. Starts with Red? True Orange is also my favorite color. 
 * Starts with Red? False I3. 
 * 
 */


package com.string;

import java.util.Scanner;

public class Task_9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Main String");
		String mainString = new String(sc.nextLine());
		
		System.out.println("Enter Su String");
		String subString = new String(sc.nextLine());
		
		boolean result = mainString.startsWith(subString);
		
		if (result == true) {
			System.out.println(mainString + " starts with " + subString);
		}
		
		else {
			System.out.println(mainString + " does not starts with " + subString);
		}
		
		sc.close();
				
	}
}
