
// Write a java program to find out the 2nd max number from given array using function. 


package com.array;

import java.util.Scanner;

public class Task_2 {
	
	public static int maxNumber(int [] array) {
		
		int max = array [0];
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}				
		return max;
	}
	
	public static int secondMax(int [] array, int max) {
		int max2 = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < max && array[i] > max2) {
				max2 = array[i];
			}
		}
		
		return max2;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int len = sc.nextInt();
		
		System.out.println("Enter value in the array: ");
		int [] arr = new int[len];
		for(int i = 0; i < len; i++) {
			arr[i] = (int) sc.nextInt(); 
		}
		
		int max = maxNumber(arr);
		int max2 = secondMax(arr, max);
		
		System.out.println("The max number is: " + max2);


	}
}

