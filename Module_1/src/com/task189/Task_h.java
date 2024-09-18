package com.task189;

import java.util.Scanner;

public class Task_h {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = 0;
		if(num>0) {
		while(num>0) {
			int rem = num%10;
			if(rem>max) {
				max = rem;
			}
			num = num/10;
		}
		System.out.println(max);
		}
		else if(num<0) {
			num = num*(-1);
			while(num>0) {
				int rem = num%10;
				if(rem>max) {
					max = rem;
				}
				num = num/10;
			}
			System.out.println(max);
		}
	}

}
