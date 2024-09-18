package com.task189;

import java.util.Scanner;

public class Task_m {
	public static void main(String[] args) {
		
		System.out.println("Enter the numbers: ");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("Enter add for Addition");
		System.out.println("Enter sub for Subtraction");
		System.out.println("Enter multi for Multiplication");
		System.out.println("Enter div for Division");
		System.out.println("");		
		System.out.println("Enter the numbers: ");
		String choice = sc.next();
		double res = 0;
		
		switch(choice) {
		
		case "add": 
			res = num1 + num2;
			System.out.println(res);
			break;
			
		case "sub": 
			res = num1 - num2;
			System.out.println(res);
			break;
			
		case "multi": 
			res = num1 * num2;
			System.out.println(res);
			break;
			
		case "div": 
			res = num1 / num2;
			System.out.println(res);
			break;
			
		default: System.out.println("Invalid Choice");
		break;
		}
		
		
	}

}
