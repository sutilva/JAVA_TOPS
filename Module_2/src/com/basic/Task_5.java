//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.


package com.basic;

import java.util.Scanner;

public class Task_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("Enter number "+i);
			int a = sc.nextInt();
			sum = a + sum;
			avg = sum/i;
		}
		
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
	}

}
