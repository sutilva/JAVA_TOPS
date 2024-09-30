/*
 * 
 * W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com 
 * and topsint.com: true Comparing Topsint.com and topsint.com: false
 * 
 */


package com.string;

import java.util.Scanner;

public class Task_7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String-1: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter String-2: ");
		String str2 = sc.nextLine();
		
		boolean result = str1.equals(str2);
		
		if(result == true) {
			System.out.println("The strings are equal !!");
		}
		
		else {
			System.out.println("The string are not equal !!");
		}
		
		sc.close();
	}
}
