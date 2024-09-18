package com.task189;

import java.util.Scanner;

public class Task_f {
	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = 0;
		
		
			for(int i=1; i<=10; i++) {
				res = num * i;
				System.out.println(num + " X " + i + " = " + res);
			}
		
	}

}
