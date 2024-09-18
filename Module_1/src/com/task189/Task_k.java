package com.task189;

import java.util.Scanner;

public class Task_k {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = 0;
		int factors = 0;
		
		for(int i = 2; i<num; i++) {
			rem = num%i;
			if(rem == 0) {
				factors++;
			}
			
		}
		if(factors>0) {
			System.out.println("It is not prime");
		}
		else {
			System.out.println("It is prime");
		}
		
		
	}
}