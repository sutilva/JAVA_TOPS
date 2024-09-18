//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.



package com.basic;

public class Task_9 {
	public static void main(String[] args) {
		int num = 100;
		
		for(int i=1; i<=100; i++) {
			
			int rem3 = i%3;
			int rem5 = i%5;
			int rem15 = i%15;
			
			if(rem3==0 || rem5==0 || rem15==0) {
		
			System.out.println(i);
		
			
		    }
	     }
    }
}	
