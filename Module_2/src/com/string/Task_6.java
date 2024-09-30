/*
 * W.A.J.P to concatenate a given string to the end of another string.
 */


package com.string;

import java.util.Scanner;

public class Task_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the string to concatenate: ");
		String conc = sc.nextLine();
		
		String resultedString = str.concat(" "+ conc);
		
		System.out.println("The resulted string: " + resultedString);
		
		sc.close();
	}
}
