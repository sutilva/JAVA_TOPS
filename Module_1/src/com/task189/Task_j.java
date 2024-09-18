package com.task189;

import java.util.Scanner;

public class Task_j {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		int last = num%10;
		int first = 0;
		
		while(num>0) {
			
			int rem = num%10; 
			if(rem>0) {
				first = rem;
			}
			num = num/10;
		}
		sum = first + last;
		System.out.println(sum);
	}

}
