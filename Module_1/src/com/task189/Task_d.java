package com.task189;

import java.util.Scanner;

public class Task_d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int factorial = 1;
		
		if(num>0) {
			for(int i=1; i<=num; i++) {
				factorial = factorial*i;
			}
			System.out.println(factorial);
		}
		
	}

}
