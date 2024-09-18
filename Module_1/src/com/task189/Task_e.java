package com.task189;

import java.util.Scanner;

public class Task_e {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int fib = 0;
		int pre = 0;
		int curr = 1;
		
		if(num>0) {
			System.out.print(" "+pre);
			System.out.print(" "+curr);
			for(int i=1; i<=num; i++) {
				fib = pre + curr;
				pre = curr;
				curr = fib;
				System.out.print(" "+fib);
				
			}
		}
	}

}
