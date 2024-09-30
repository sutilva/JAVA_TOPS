/*
 * Write a program which will ask the user to enter his/her marks (out of 100). 
 * Define a method that will display grades according to the marks entered as below: 
 * Marks Grade : 
 * 91-100 A 
 * 81-90 B 
 * 71-80 C
 * 61-70 D 
 * 51-60 E 
 * 41-50 EE
 * 1-40  Fail 
 */


package com.oops;

import java.util.Scanner;

public class Task_12 {
	
	// Display Grades
	public static void displayGrade(int marks) {
		
		if(marks >= 91 && marks <= 100) {
			System.out.println("Your grade is A");
		}
		
		else if(marks >= 81 && marks <= 90) {
			System.out.println("Your grade is B");
		}
		
		else if(marks >= 71 && marks <= 80) {
			System.out.println("Your grade is C");
		}
		
		else if(marks >= 61 && marks <= 70) {
			System.out.println("Your grade is D");
		}
		
		else if(marks >= 51 && marks <= 60) {
			System.out.println("Your grade is E");
		}
		
		else if(marks >= 41 && marks <= 50) {
			System.out.println("Your grade is EE");
		}
		
		else {
			System.out.println("You are fail !!");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks out of 100: ");
		int marks = sc.nextInt();
		
		if (marks <= 0 || marks > 100) {
			System.out.println("Invalid Marks !!");
		}
		else {		
			displayGrade(marks);
		}
		
		sc.close();
	}
}
