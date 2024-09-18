package com.task189;

import java.util.Scanner;

public class Task_g {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = 0;
		while(num>0) {
			rem = num%10;
			System.out.print(rem + " ");
			num = num/10;
				
			}
		
	}

}
