//Write a java program Find out length of string without using inbuilt function 


package com.array;

import java.util.Scanner;

public class Task_5 {
	public static void main(String[] args) {
		
		int len = 0;
		//Input string from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.next();
		char c [] = str.toCharArray();
		len = c.length;
		
		System.out.println("Length of String: " + len);
				
	}
}
