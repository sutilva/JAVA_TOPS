// Write a Java program to Take three numbers from the user and print the greatest number.


package com.basic;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("Enter first number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter first number: ");
		int num3 = sc.nextInt();
		
		System.out.println("");
		System.out.println("Max number is: ");
				
			if(num1>num2) {
				if(num1>num3) {
					System.out.println(num1);
				}
			}
			else if(num2>num3) {
					System.out.println(num2);
				}
			else {
				System.out.println(num3);
			}
		
	}
}

