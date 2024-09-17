package com.task179;

public class Task_9 {
	public static void main(String[] args) {
		int year = 2024;
		double leapYear = year%4;
		
		if(leapYear == 0) {
			System.out.println("Given year is a leap year");
		} 
		else {
			System.out.println("Given year is not a leap year");
		}
	}
}
