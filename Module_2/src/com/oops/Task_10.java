/*
 * Write a program to print the factorial of a number by defining a method named 'Factorial'. 
 * Factorial of any number n is represented by n! And is equal to 1*2*3*. *(n-1) *n.
 * E.g.- 4! = 1*2*3*4 = 24 		3! = 3*2*1 = 6         2! = 2*1 = 2               
 * Also, 1! = 1           0! = 0 
 */


package com.oops;

import java.util.Scanner;

public class Task_10 {
	
	// Returns factorial
	public static int factorial(int num) {
		
		int fact = 1;
		if(num == 0) {
			fact = 0;			
		}
		else {
			for(int i = 1; i <= num; i++) {
				fact = fact * i;				
			}
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		int number = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
		int fact = factorial(number);
		
		
		// Printing Logic
		if(number == 0) {			
			System.out.print(number + "! = ");
			System.out.print(fact);
			
		}
		
		else if(number == 1) {
			System.out.print(number + "! = ");
			System.out.print(fact);
		}
		
		else {			
			System.out.print(number + "! = ");
			for(int i = 1; i <= number; i++) {
				
				if(i == number) {
					System.out.print(i);
				}
				else {
				System.out.print(i+"*");
				}
			}	
			System.out.print(" = " + fact);
		}
		
		sc.close();
	
	}

}
