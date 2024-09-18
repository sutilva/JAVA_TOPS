//Write a Java program that reads a positive integer and count the number of digits the number. 



package com.basic;

import java.util.Scanner;

public class Task_8 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 0;
		while(a>0) {
			
			a = a/10;
			count++;
		}
		
		System.out.println("Number of digits: " + count);
	}
}
