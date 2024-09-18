package com.task189;

import java.util.Scanner;

public class Task_i {
	public static void main(String[] args) {
		System.out.println("Enter the numer: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0) {
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println(sum);
	}
}
