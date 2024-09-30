/*
 * 
 * W.A.J.P to check whether a given string ends with the contents of another string. 
 * "Java Exercises" ends with "se"? False 
 * "Java Exercise" ends with "se"? True 
 * 
 */


package com.string;

import java.util.Scanner;

public class Task_8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Main String");
		String mainString = new String(sc.nextLine());
		
		System.out.println("Enter the Sub String");
		String subString = new String(sc.nextLine());
		
		boolean comparisonResult = mainString.endsWith(subString);
		
		if (comparisonResult == true) {
			System.out.println(mainString + " ends with " + subString);
		}
		
		else {
			System.out.println(mainString + " does not ends with " + subString);
		}
		
		sc.close();
	}
}
