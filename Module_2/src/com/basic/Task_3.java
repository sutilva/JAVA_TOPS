//Write a Java program that takes a year from user and print whether that year is a leap year or not.


package com.basic;

import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		if(year%4 == 0) {
			System.out.println("Leap Year!!");
		}
		else {
			System.out.println("Not a leap year");
		}
	}
}
